package com.company;

public class clone implements Cloneable{
        int rollno;
        String name;

        clone(int rollno,String name){
            this.rollno=rollno;
            this.name=name;
        }

        public Object clone()throws CloneNotSupportedException{
            return super.clone();
        }

        public static void main(String args[]){
            try{
                clone s1=new clone(001,"Aadi");

                clone s2=(clone)s1.clone();

                System.out.println(s1.rollno+" "+s1.name);
                System.out.println(s2.rollno+" "+s2.name);

            }catch(CloneNotSupportedException c){}

        }
    }
