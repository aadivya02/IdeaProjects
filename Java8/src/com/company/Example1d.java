package com.company;

interface Uppercase<T>{
    T operation(T a);

}
public class Example1d {

        public static void main(String[] args) {
            Uppercase<String> uppercase=(a)-> a.toUpperCase();
            System.out.println(uppercase.operation("Hello World"));
        }
    }


