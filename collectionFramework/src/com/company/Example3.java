package com.company;
import java.util.HashMap;


public class Example3 {


        public static void occuranceOfChars(String inputString) {

            HashMap<Character, Integer> hashMap = new HashMap<>();

            char[] strArray = inputString.toLowerCase().replace(" ", "").toCharArray();

            for (char c : strArray) {

                if (hashMap.containsKey(c)) {

                    hashMap.put(c, hashMap.get(c) + 1);
                } else {
                    hashMap.put(c, 1);
                }

            }
            System.out.println(hashMap);

        }

        public static void main(String[] args) {

            occuranceOfChars("coding is good ");

            occuranceOfChars("we have to work hard");

        }

    }

