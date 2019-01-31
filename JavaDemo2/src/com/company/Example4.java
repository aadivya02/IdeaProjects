package com.company;

public class Example4 {

        public static void main(String[] args) {
            Singleton o = Singleton.getInstance();
            o.dispaly();

        }

    }

    class Singleton {

        private static Singleton singleton1 = new Singleton();

        private Singleton()
        {

        }

        public static Singleton getInstance(){
            return singleton1;
        }

        public void  dispaly(){
            System.out.println("hiii");
        }

    }


