package com.company;


interface Concatinate<T,R>{
    T operation(T a, R b);

}
public class Example1c {


        public static void main(String[] args) {
            Concatinate<String,String> concatinate=(a,b)-> a+b;
            System.out.println(concatinate.operation("Hii","How Are You"));
        }
    }


