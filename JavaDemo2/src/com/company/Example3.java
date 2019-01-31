package com.company;
import java.lang.Exception;

  class MyClass
        {
     static int i=1/0;
        }

public class Example3 {


        public static void main(String[] args) {
            try
            {
                MyClass my = new MyClass();

            }
            catch(Throwable e)
            {

                System.out.print(e);
            }

            MyClass c = new MyClass();
        }
    }



