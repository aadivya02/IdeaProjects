package com.company;
class Student {

    private String Name;
    private Integer id;
    private Integer Age;
    private String Stream;
    private boolean Placed;
    private String Address;

    public Student(StudentBuilder StudentBuilder) {
        id = StudentBuilder.getId();
        Name = StudentBuilder.getName();
        Age = StudentBuilder.getAge();
        Placed = StudentBuilder.isPlaced();
        Address = StudentBuilder.getAddress();
        Stream= StudentBuilder.getStream();
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer Age) {
        this.Age = Age;
    }

    public boolean isPlaced() {
        return Placed;
    }
    public void isPlaced(boolean Placed) {
        this.Placed = Placed;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }


    public String getStream() {
        return Stream;
    }

    public void setStream(String Stream) {
        this.Stream = Stream;
    }
    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", id=" + id +
                ", Age=" + Age +
                ", Stream=" + getStream() +
                ", hasAddress=" + getAddress() +
                ", Placed=" + isPlaced() +
                '}';
    }
}

class StudentBuilder {
    private String Name;
    private Integer id;
    private Integer Age;
    private String Stream;
    private boolean isPlaced;
    private String Address;

    public StudentBuilder(String Name, Integer id,String Address, String Stream) {
        this.Name = Name;
        this.id = id;
        this.Stream= Stream;
        this.Address=Address;
    }

    public String getName() {
        return Name;
    }

    public StudentBuilder setName(String Name) {
        this.Name = Name;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public StudentBuilder setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getAge() {
        return Age;
    }

    public StudentBuilder withAge(Integer Age) {
        this.Age = Age;
        return this;
    }

    public boolean isPlaced() {
        return isPlaced;
    }

    public StudentBuilder isPlaced(boolean Placed) {
        this.isPlaced = Placed;
        return this;
    }

    public String getAddress() {
        return Address;
    }

    public StudentBuilder setAddress(String Address) {
        this.Address = Address;
        return this;
    }

    public String getStream() {
        return Stream;
    }

    public StudentBuilder setStream(String Stream) {
        this.Stream = Stream;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}
public class Example4 {
    public static void main(String[] args) {
        Student Student = new StudentBuilder("Aadivya",3011,"Sector 127,Noida","Cs")
                .isPlaced(true)
                .withAge(23)
                .build();

        System.out.println(Student);
    }
}