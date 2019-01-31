package com.company;

public class Main {

    public static void main(String[] args) {

      //  Employee e1 = new Employee("srivastava","aadi",1);
       // System.out.println(e1.empStat());
Employee.empStatus();
    }
    }

 class Employee {

    static {
        String lastName ;
        String firstName ;
        double ID;
    }
    public Employee(String lastName, String firstName, double ID){
        this.lastName = lastName;
        this.firstName = firstName;
        this.ID = ID;
    }

    public  static String empStatus()
    {
        return "Last Name: " + lastName + "First Name: " + firstName + "ID" + ID;
    }

}
