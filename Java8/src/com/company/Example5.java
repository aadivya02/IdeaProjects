package com.company;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Example5 {

        public static void main(String[] args) {
            List<Integer> list = Arrays.asList(5,4,3,2,1);
            OptionalDouble avg = list.stream().mapToInt(num -> num * 2).average();
            System.out.println(avg.getAsDouble());
        }
    }

