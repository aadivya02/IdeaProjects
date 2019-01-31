package com.company;

public class Example9 {


    public static void main(String[] args) {

    }
}

abstract class Wooden {
    String Quality;
    double price;

}

abstract class Metallic {
    String Quality;
    double price;

}

interface stressTest
{
    //some Rules
}

interface fireTest {
    //some Rules

    class Chair extends Wooden implements stressTest, fireTest {
        private double height;
        private double width;
        private String color;
        private String quantity;
        private double price;
    }

    class Table extends Wooden implements stressTest, fireTest {
        private double height;
        private double width;
        private String color;
        private String quantity;
        private double price;
    }

    class MetalChair extends Metallic {
        private double height;
        private double width;
        private String color;
        private double price;

    }

    class MetalTable extends Metallic {
        private double height;
        private double width;
        private String color;
        private double price;

    }


}