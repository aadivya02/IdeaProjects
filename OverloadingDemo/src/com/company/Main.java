package com.company;

public class Main {

    public static void main(String[] args) {
	calc c1 = new calc();
	c1.add();

    }
}

class calc{

    int x=10;
    int y=20;

    public void  add(){

        int c=x+y;
        System.out.println(c);


    }
}