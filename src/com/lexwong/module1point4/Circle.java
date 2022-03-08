package com.lexwong.module1point4;

public class Circle extends TwoDShape {
    public final double Pi = 3.14159265;
    private double radius;
    Circle (double radius){
        this.radius = radius;
        getArea();
    }

    public double getArea(){
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
}
