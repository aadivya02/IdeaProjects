package com.company;
public class Main {
    public static void main(String[] args){
        String Values="Hello! How are You 64";
        int uppercase=0;
        int lowercase=0;
        int digit=0;
        int other=0;
        String Value=Values.replaceAll(" ","");
        char[] CharArray=Value.toCharArray();
        int totalchar= Value.length();
        for(int i=0;i<Value.length();i++){
            if(Character.isLowerCase(CharArray[i])) {
                lowercase++;
            }else if(Character.isUpperCase(CharArray[i])) {
                uppercase++;
            }else if(Character.isDigit(CharArray[i])){
                digit++;
            }else{
                other++;
            } }
            System.out.println("Total Characters:" +totalchar);
            System.out.println("Uppercase:" +uppercase);
            System.out.println("Percentage Upper:" +((uppercase*100)/totalchar));
            System.out.println("Lowercase:" +lowercase);
            System.out.println("Percentage Lower:" +((lowercase*100)/totalchar));
            System.out.println("Digit:" +digit);
            System.out.println("Percentage Digit:" +((digit*100)/totalchar));
            System.out.println("Others:" +other);
            System.out.println("Percentage Others:" +((other*100)/totalchar));
        }
    }

