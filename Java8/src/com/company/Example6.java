package com.company;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

    public class Example6 {
        public static void main(String[] args) {
            List<Integer> integerList= Arrays.asList(4,5,3,5,6,7,8,86,6,9);
            Optional<Integer> First= integerList.stream().filter(e -> e%2==0).filter(e -> e>3).findFirst();
            System.out.println(First);
        }
    }


