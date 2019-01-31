package com.company;


// method references
import java.util.Arrays;
import java.util.List;

public class Dj89 {

    private static  void printme(Integer s){
        System.out.println(s);
    }
    public static void main(String[] args) {

        List<Integer> integerList= Arrays.asList(13,12,5,5,12);

        //integerList.forEach(Dj89::printme);
        integerList.stream().distinct().forEach(System.out::println);  //using stream


    }

}
