package com.company;

interface Shape{

    void getShapeType();

}

class Square1 implements Shape{
    @Override
    public void getShapeType() {
        System.out.println("This is Square Type");
    }
}

class Triangle implements Shape{
    @Override
    public void getShapeType() {
        System.out.println("This is Triangle Type");
    }
}

class Pentagon implements Shape{
    @Override
    public void getShapeType() {
        System.out.println("This is Pentagon Type");
    }
}

class Hexagon implements Shape{
    @Override
    public void getShapeType() {
        System.out.println("This is Hexagon Type");
    }
}

class Polygon{
    Shape shape;

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
}

class PolygonFactory {
    static Polygon getPolygonObject(String name) {
        Polygon polygon = new Polygon();
        switch (name) {
            case "Square Polygon":
                polygon.setShape(new Square1());
                break;
            case "Triangle Polygon":
                polygon.setShape(new Triangle());
                break;
            case "Pentagon Polygon":
                polygon.setShape(new Pentagon());
                break;
            case "Hexagon Polygon":
                polygon.setShape(new Hexagon());
                break;
        }
        return polygon;
    }
}
public class ed {
    public static void main(String[] args) {
        Polygon SquareTypePolygon = PolygonFactory.getPolygonObject("Square Polygon");
        SquareTypePolygon.getShape().getShapeType();
        Polygon TriangleTypePolygon = PolygonFactory.getPolygonObject("Triangle Polygon");
        TriangleTypePolygon.getShape().getShapeType();
        Polygon HexagonTypePolygon = PolygonFactory.getPolygonObject("Hexagon Polygon");
        HexagonTypePolygon.getShape().getShapeType();
        Polygon PentagonTypePolygon = PolygonFactory.getPolygonObject("Pentagon Polygon");
        PentagonTypePolygon.getShape().getShapeType();

    }
}
