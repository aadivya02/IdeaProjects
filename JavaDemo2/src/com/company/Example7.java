package com.company;
import java.util.Scanner;
public class Example7 {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input seconds: ");
            double seconds = in.nextInt();
            double mins= seconds/60;
            double hrs = mins/60;
            int days = (int)hrs/24;

            System.out.print( "hours"+hrs + ":"+"minutes" + mins + ":"+"days" + days+"seconds"+seconds);
            System.out.print("\n");
        }
    }




