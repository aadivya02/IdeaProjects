package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

    class Employee implements Comparator<Employee> {


        private double age;
        private double salary;
        private String name;

        Employee(double age, double salary, String name) {
            this.age = age;
            this.salary = salary;
            this.name = name;
        }


        Employee() {
        }

        @Override
        public String toString() {
           return "Employee{" +
                    "salary=" + salary +
                    '}';
        }

        @Override
        public int compare(Employee o1, Employee o2) {

            if (o1.salary < o2.salary) {
                return -1;
            }
            if (o1.salary > o2.salary) {
                return 1;
            } else return 0;
        }
    }


    public class Example4 {


        public static void main(String[] args) {

            List<Employee> employeeList = new ArrayList<>();
            employeeList.add(new Employee(23.00, 470000, "Aadivya"));
            employeeList.add(new Employee(22.00, 550000, "Shivani"));
            employeeList.add(new Employee(24.00, 430000, "Sumit"));
            employeeList.add(new Employee(25.00, 450000, "Sudhanshu"));
            employeeList.add(new Employee(26.00, 330000, "Priyanka"));


            Employee employee = new Employee();
            Collections.sort(employeeList, employee);

            for (Employee e : employeeList) {

                System.out.println(e.toString());
            }

        }


}
