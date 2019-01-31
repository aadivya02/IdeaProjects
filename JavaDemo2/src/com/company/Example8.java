package com.company;
import java.util.Scanner;
public class Example8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scanner.next();
        do
        {
            if(word.charAt(0) == word.charAt(word.length() - 1))
            {
                System.out.println("First and last character are equals for the word: " + word);
            }
            else
            {
                System.out.println("First and last character are NOT equals for the word: " + word);
            } word = scanner.next();
        }while(!word.equals("done"));
    }

}
