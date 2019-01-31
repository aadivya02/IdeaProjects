package com.company;


    public class student implements Cloneable{
        int rollno;
        String name;

        student(int rollno,String name){
            this.rollno=rollno;
            this.name=name;
        }

        public Object clone()throws CloneNotSupportedException{
            return super.clone();
        }

        public static void main(String args[]){
            try{
                student s1=new student(10,"Aadivya");

                student s2=(student)s1.clone();

                System.out.println(s1.rollno+" "+s1.name);
                System.out.println(s2.rollno+" "+s2.name);

            }catch(CloneNotSupportedException c){}

        }
    }
