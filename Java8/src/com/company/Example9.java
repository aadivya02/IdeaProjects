package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Example9{
    public static void main(String[] args) {
        try{
            String path = "C:\\Users\\Aadivya\\Desktop\\Test.txt";
            FileOutputStream fout = new FileOutputStream(path);
            PrintStream ps = new PrintStream(fout);
            ps.println(101);
            ps.println("Aadivya");
            ps.println("Prakash");
            fout.close();
            ps.close();
            System.out.println("Success ");
        }catch(IOException exception){
            System.out.println(exception);
        }
    }
}


