package com.lexwong.module1point2;

public class Circle extends TwoDShape{
    public final double PI = 3.14159265;
    private double radius;
    Circle (double radius){
        this.radius = radius;
        getArea();
    }

    public double getArea(){
        double area = PI*Math.pow(radius, 2);
        return area;
    }

    @Override
    public String toString() {
        return "Circle has: " +
                "Pi = " + PI +
                ", and radius = " + radius +
                ". The area is: " + getArea();
    }
}
