package com.company;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class Example2 {



        public static void main(String[] args)
        {
            String a1 = "AADIVYAPRAKASH";
            String a2 = a1.toLowerCase();
            System.out.println("NO. OF UNIQUE CHARACTERS::");
            System.out.println(countUniqueCharacters(a2));
        }
        public static int  countUniqueCharacters(String a)
        {
            char[] charArray = a.toCharArray();
            HashSet<Character> set = new HashSet<Character>();
            for(int i = 0 ; i< charArray.length ; i++)
            {
                set.add(charArray[i]);
            }
            return   set.size();
        }
    }



