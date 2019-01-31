package com.company;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class Example9 {


        public static void main(String[] args) {

            SimpleDateFormat ind1 = new SimpleDateFormat("dd/MM/yyyy zZ HH:mm:ss a");
            SimpleDateFormat usa1 = new SimpleDateFormat("MM/dd/yyyy zZ HH:mm:ss a");
            SimpleDateFormat pak1 = new SimpleDateFormat("yyyy-MM-dd zZ HH:mm:ss a");

            TimeZone ind = TimeZone.getTimeZone("Asia/Kolkata");
            TimeZone usa = TimeZone.getTimeZone("US/Central");
            TimeZone pakistan = TimeZone.getTimeZone("Asia/Karachi");

            ind1.setTimeZone(ind);
            usa1.setTimeZone(usa);
            pak1.setTimeZone(pakistan);

            System.out.println("India Time format "+ind1.format(new Date()));
            System.out.println("USA time format "+usa1.format(new Date()));
            System.out.println("Pak time format "+pak1.format(new Date()));

        }
    }

