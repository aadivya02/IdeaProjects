package com.company;
@FunctionalInterface
// generic interface
 interface  something<T> { //we dont use public with interface bcoz ,, if we use public then class name and interface should be same


    void printMe(T s); // T is a type of datatype

}
  public class Dj83 {

    public static void main(String[] args) {
        something<String> stringSomething= (s) -> System.out.println(s);
        stringSomething.printMe("hello");
    }
}
