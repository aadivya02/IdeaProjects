package com.company;

interface Increment<T> {
    T operation(T a);
}

public class Example1b {



        public static void main(String[] args) {
            Increment<Integer> increment=(a)-> a+1;
            System.out.println(increment.operation(7));
        }
    }

