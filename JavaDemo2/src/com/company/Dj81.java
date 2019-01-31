package com.company;

interface Something{
    void printMe();
    void printSomething();

}

//we dont use lambda exp for multiple interface methods

public class Dj81 {
    public static void main(String[] args) {
        Something so =new Something() {
            @Override
            public void printMe() {
                System.out.println("printme");

            }

            @Override
            public void printSomething() {
                System.out.println("print something");

            }
        };
    }
}
