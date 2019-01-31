package com.company;
import java.util.ArrayList;
import java.util.List;

//Component
interface Directory {
    void showDirectoryDetails();
}
//Leaf
class Developer implements Directory {
    private String name;
    private int ID;
    private String favoriteLanguage;

    public Developer(String name, int ID, String favoriteLanguage) {
        this.name = name;
        this.ID = ID;
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    @Override
    public void showDirectoryDetails() {
        System.out.println("Developer{"
                + "name:" + name + " "
                + "id:" + ID + " "
                + "favoriteLanguage:" + favoriteLanguage + "}");
    }

    @Override
    public String toString() {
        return "Developer{"
                + "name:" + name + " "
                + "id:" + ID + " "
                + "favoriteLanguage:" + favoriteLanguage + "}";
    }
}
//leaf
class QE implements Directory{

    private String name;
    private int ID;
    private String Framework;

    public QE(String name, int ID, String Framework) {
        this.name = name;
        this.ID = ID;
        this.Framework = Framework;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFramework() {
        return Framework;
    }

    public void setFramework(String Framework) {
        this.Framework = Framework;
    }

    @Override
    public void showDirectoryDetails() {
        System.out.println("QE{"
                + "name:" + name + " "
                + "id:" + ID + " "
                + "Framework:" + Framework + "}");
    }

    @Override
    public String toString() {
        return "QE{"
                + "name:" + name + " "
                + "id:" + ID + " "
                + "Framework:" + Framework + "}";
    }
}

//Composite
class DeveloperDirectory implements Directory{

    List<Directory> developerDirectory = new ArrayList<Directory>();

    @Override
    public void showDirectoryDetails() {
        System.out.println("Developer Directory");
        developerDirectory.forEach(e->e.showDirectoryDetails());
    }
}

//Composite
class QEDirectory implements Directory{

    List<Directory> QEDirectory = new ArrayList<Directory>();

    @Override
    public void showDirectoryDetails() {
        System.out.println("QE Directory");
        QEDirectory.forEach(e->e.showDirectoryDetails());
    }
}

//Composite

class CompanyDirectory implements Directory{

    List<Directory> companyDirectory = new ArrayList<>();

    @Override
    public void showDirectoryDetails() {
        companyDirectory.forEach(e->e.showDirectoryDetails());
    }
}

//Client
public class Example7 {

    public static void main(String[] args) {

        Developer developer1 = new Developer("Ankur",22,"JAVA");
        Developer developer2 = new Developer("Gaurav",25,"Python");

        QE QE1 = new QE("Aadivya",10,"Selenium");
        QE QE2 = new QE("Sudhanshu",40,"Appium");

        DeveloperDirectory developerDirectory= new DeveloperDirectory();
        developerDirectory.developerDirectory.add(developer1);
        developerDirectory.developerDirectory.add(developer2);

        QEDirectory QEDirectory = new QEDirectory();
        QEDirectory.QEDirectory.add(QE1);
        QEDirectory.QEDirectory.add(QE2);

        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.companyDirectory.add(developerDirectory);
        companyDirectory.companyDirectory.add(QEDirectory);

        companyDirectory.showDirectoryDetails();

    }
}