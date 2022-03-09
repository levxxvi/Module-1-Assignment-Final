package com.lexwong.module1point4;

public class Circle extends TwoDShape {
    public final double Pi = 3.14159265;
    private double radius;
    public Circle(double radius){
        if (radius < 0){
            radius = 1;
        }
        this.radius = radius;
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
