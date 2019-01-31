package com.company;

interface Greaterthan {
    boolean operation(int a, int b);
}

public class Example1a {


        public static void main(String[] args) {
            Greaterthan greaterthan=(a, b) -> a>b;
            System.out.println(greaterthan.operation(10,7));
        }
    }



