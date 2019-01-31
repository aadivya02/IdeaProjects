package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example2 {
    public static void main(String[] args) {
        Consumer<Integer> consumer = i -> System.out.println(i);
        List<Integer> integerList = Arrays.asList(5,6,7,8,9);
        printConsumer(integerList,consumer);
        Supplier<String> StrSupplier = () -> new String("Supplier Test");
        String str = StrSupplier.get();
        printSupplier(str);
        Predicate<String> predicateString = s -> {return s.equals("Hello");};
        printPredicate(predicateString);
        calc((a) -> "Result: " + (a * 5), 20);
    }

    public static void printConsumer(List<Integer> integerList, Consumer<Integer> consumer ){
        System.out.println(" Consumer Interface ");
        for(Integer integer:integerList){
            consumer.accept(integer);
        }
        System.out.println("  Consumer Interface Ends ");

    }

    public static void printSupplier(String str){
        System.out.println(" Supplier Interface ");
        System.out.println(str);
        System.out.println(" Supplier Interface Ends");

    }

    public static void printPredicate(Predicate<String> predicateString){
        System.out.println(" Predicate Interface ");
        System.out.println(predicateString.test("Hello"));
        System.out.println(predicateString.test("Hello World"));
        System.out.println(" Predicate Interface Ends ");

    }

    public static void calc(Function<Integer, String> bi, Integer i) {
        System.out.println(" Function Interface ");
        System.out.println(bi.apply(i));
        System.out.println(" Function Interface Ends ");

    }

}
