package com.company;

import java.util.Arrays;
import java.util.List;
    public class Example3 {
        public static void main(String[] args) {
            List<Integer> integerList= Arrays.asList(3,5,3,5,11,6,88,74,6,9);
            integerList.stream().filter( e -> e%2==0).forEach(System.out::println);
        }
    }


