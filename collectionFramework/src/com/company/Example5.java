package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparator<Student> {


    private String name;
    private Double score;
    private Double age;

    public Student() {
    }


    public Student(String name, Double score, Double age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }


    @Override
    public int compare(Student o1, Student o2) {

        if (o1.getScore().equals(o2.getScore())) {
            return o1.getName().compareTo(o2.getName());
        }
        if (o1.getScore() < o2.getScore()) {
            return -1;
        } else return 1;
    }
}

public class Example5 {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Rishabh", 48.00, 21.00));
        studentList.add(new Student("Gaurav", 49.00, 23.00));
        studentList.add(new Student("Ankur", 45.00, 25.00));
        studentList.add(new Student("Uttu", 70.00, 32.00));
        studentList.add(new Student("Amit", 65.00, 60.00));
        studentList.add(new Student("Rohit", 85.00, 34.00));


        Student student = new Student();

        //studentList.sort(student);
        Collections.sort(studentList, student);

        for (Student s : studentList) {
            System.out.println(s.toString());
        }

    }

}