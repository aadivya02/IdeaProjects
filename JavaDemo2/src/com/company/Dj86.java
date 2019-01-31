package com.company;


//predicate interface
//function inteface
//Bifuctional inteface
//Runable interfaces

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Dj86 {
    public static void main(String[] args) {

        List<Integer> integerList= Arrays.asList(1,2,3,45,7);
        Predicate<Integer> predicate = e -> e%2==0;
        System.out.println(predicate.test(5));

        Function<String , String> function = (s)->s +"hello";
        System.out.println(function.apply("nice"));

        BiFunction<Integer,Integer,Integer> add = (a,b) -> a+b;
        System.out.println(add.apply(10,11));

        Runnable runnable=()-> System.out.println("hello world");
        runnable.run();
    }



}
