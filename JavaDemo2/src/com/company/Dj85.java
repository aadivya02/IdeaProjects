package com.company;

interface Calci<T , R>{

    R operation(T a);
}
public class Dj85 {

    public static void main(String[] args) {

        Calci<String , String> calci = a-> a;
        System.out.println(calci.operation("hello world"));

    }
}
