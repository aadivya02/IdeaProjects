package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example8 {

        public static void main(String[] args) {
            LocalDateTime current =LocalDateTime.now();
            DateTimeFormatter formatting =DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss.SSS");

            String formatteddate=current.format(formatting);
            System.out.println("Current date and time is :" +formatteddate);
        }

    }
