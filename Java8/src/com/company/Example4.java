package com.company;
import java.util.Arrays;
import java.util.List;


    public class Example4 {
        public static void main(String[] args) {
            List<Integer> integerList= Arrays.asList(5,8,8,5,6,7,8,67,98,90);
            int sum= integerList.stream().filter( e -> e>5).mapToInt(e->e).sum();
            System.out.println(sum);
        }
    }



