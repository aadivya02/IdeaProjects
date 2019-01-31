package com.company;

public class Example5 implements Cloneable {

        private int id;
        private String name;
        private Double salary;
        private String designation;

        Example5(int empId, String empName, Double empSalary, String empDesignation)
        {
            this.id = empId;
            this.name = empName;
            this.salary = empSalary;
            this.designation = empDesignation;
        }

        Example5(Example5 emp)
        {
            this.id = emp.id;
            this.name = emp.name;
            this.salary = emp.salary;
            this.designation = emp.designation;
        }

        public Object clone()throws CloneNotSupportedException{
            return super.clone();
        }

        public static void main(String[] args) {
          Example5 employee1 = new Example5(1, "Aadivya", 30000.8, "QE");
          Example5 employee2 = new Example5(employee1);
            System.out.println(employee1.id+" "+employee1.name + " "+" "+employee1.designation );
            System.out.println("Copy Constructor Data");
            System.out.println(employee2.id+" "+employee2.name + " "+" "+employee2.designation );


    }



}
