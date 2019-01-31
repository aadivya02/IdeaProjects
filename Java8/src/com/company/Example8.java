package com.company;
import java.io.*;

public class Example8 {
    public static void main(String[] args) {
        String path = "C:\\Users\\Aadivya\\Desktop\\Test.ser";
        try{
            FileOutputStream fout = new FileOutputStream(path);
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            String s = "Aadivya";
            byte b[] = s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
            System.out.println(" Success ");
        }catch(IOException e){
            System.out.println(e);
        }
        try{
            FileInputStream fin = new FileInputStream(path);
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while((i=bin.read())!=-1){
                System.out.println((char)i);
            }
            fin.close();
            bin.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
