package com.company;
@FunctionalInterface // it will use to chk that interface contain only 1 abstract methods
interface calculation{
    int operation(int a, int b);
    public String toString(); // it will not show any error becoz string is a parent type ,, internally in tostring  contain the body so it is internally a default method
    default void printme(String s){ // it will not show any error bcoz in deafult we give the body part
        System.out.println(s);

    }

}


public class Dj82 {
    public static void main(String[] args) {
        calculation add = ( a,  b)  ->
                 a+b;
        calculation sub =(a,b)-> a-b;
        calculation mul = (a,b) -> a*b;
        calculation div = (a,b) -> a/b;

        System.out.println(add.operation(5,6));

        //operation is used to call the methods

        }
    }

