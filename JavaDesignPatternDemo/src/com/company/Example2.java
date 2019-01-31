/*
package com.company;

interface Polygon{

    String getType();

}

 class PolygonFactory {
    public  static Polygon getPolygon(int numberOfSides) {
        if(numberOfSides == 3) {
            System.out.println("triangle");
            return new Trianlge();
        }
        if(numberOfSides == 4) {
            System.out.println("Square");
            return new Square();
        }
       if(numberOfSides == 5) {
            System.out.println("Pentagon");
            return new Pentagon();
        }

        return null;
    }

}


class Trianlge implements Polygon{
    @Override
    public String getType() {
        return "Triangle";
    }
}

class Square implements Polygon{

    @Override
    public String getType() {
        return "square";

    }
}

class Pentagon implements Polygon{

    @Override
    public String getType() {
        return "Pentagon";
    }

}

public class Example2 {

    public static void main(String[] args) {

        System.out.println(PolygonFactory.getPolygon(4).getType());

    }

}
*/
