package com.company;

interface Color{
    String getColorValue();
}

class Red implements Color{
    @Override
    public String getColorValue() {
        return "Red";
    }
}

class Blue implements Color{
    @Override
    public String getColorValue() {
        return "Blue";
    }
}

abstract class shape{
    String type;
    Color color;

    public shape(String type, Color color) {
        this.type = type;
        this.color = color;
    }
}

class Square extends shape{
    int Side;

    public Square(Color color, int side) {
       super("Solid", color);
        Side = side;

    }

    @Override
    public String toString() {
        return "Square{" +
                "type='" + type + '\'' +
                ", color=" + color.getColorValue() +
                ", Side=" + Side +
                '}';
    }
}

class Circle extends shape{
    int radius;

    public Circle(Color color, int radius) {
        super("Hollow", color);
        this.radius = radius;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "type='" + type + '\'' +
                ", color=" + color.getColorValue() +
                ", radius=" + radius +
                '}';
    }
}


public class gh{
    public static void main(String[] args) {
        Square hollow= new Square(new Red(),30);
        Square Solid= new Square(new Blue(), 20);
        System.out.println("Red"+hollow);
        System.out.println("Blue"+Solid);
       // System.out.println(new Square(new Red(),60).toString());

        Circle hollow1= new Circle(new Red(),20);
        Circle Solid1=new Circle(new Blue(),15);
        System.out.println("Red"+hollow1);
        System.out.println("Blue"+Solid1);
    }
}

