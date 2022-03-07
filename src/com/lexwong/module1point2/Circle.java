package com.lexwong.module1point2;

public class Circle extends TwoDShape{
    public final double Pi = 3.14159265;
    private double radius;
    Circle (double radius){
        this.radius = radius;
        getArea(radius);
    }

    public double getArea(double radius){
        double area = Pi*Math.pow(radius, 2);
        return area;
    }

    @Override
    public String toString() {
        return "Circle has: " +
                "Pi = " + Pi +
                ", and radius = " + radius +
                ". The area is: " + getArea();
    }

    //original
    /*@Override
    public String toString() {
        return "Circle{" +
                "Pi=" + Pi +
                ", radius=" + radius +
                '}';
    }*/
}
