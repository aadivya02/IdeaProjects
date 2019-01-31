package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Example1 {


        public static void main(String[]args){
            List<Float> numbers=new LinkedList<Float>();
            numbers.add(new Float(17.81));
            numbers.add(new Float(15.05));
            numbers.add(new Float(20.23));
            numbers.add(new Float(31.67));
            numbers.add(new Float(48.56));
            float sum=0;
            Iterator<Float> itr=numbers.iterator();
            while(itr.hasNext()){
                float n=itr.next();
                sum=sum+n;

            }
            System.out.println("sum of numbers:" + sum);


        }


    }


