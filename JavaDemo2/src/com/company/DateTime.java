package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

    public void olddateAndTime() throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");
        String date = dateFormat.format(new Date());

        System.out.println(date);


        dateFormat = new SimpleDateFormat("dd-mm-yyyy HH:mm:ss");
        String dateInString = "23-07-1996 20:07:23";
        Date theDate = dateFormat.parse(dateInString);
        System.out.println(theDate);

    }

    public static void main(String[] args) {

        DateTime d = new DateTime();

    }
}
