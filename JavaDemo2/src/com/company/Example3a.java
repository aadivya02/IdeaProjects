package com.company;

public class Example3a {

        public static void main(String[] args)

        {
            try
            {
                Class.forName("System.java.lang");

            }
            catch (ClassNotFoundException e)

            {
                e.printStackTrace();

            }

        }

    }


