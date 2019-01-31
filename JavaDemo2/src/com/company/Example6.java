package com.company;

public class Example6 {

    public static void main( String[] args )
    {

        try{
            int [] arr= new int[5];

            arr[3]= 35/0;

        }
        catch(ArithmeticException e)
        {

            System.out.println("'Arithemtic Exception");

        }

        catch (Exception e)
        {
            System.out.println("Exception Generated");

        }

        finally {

            System.out.println(" This block will always execute");

        }
    }

}
