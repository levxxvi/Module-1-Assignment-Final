package com.lexwong.module1point4;

public class Circle extends TwoDShape {
    public final double PI = 3.14159265;
    private double radius;
    //since the radius of a circle cannot be less than zero (a negative number), any negative input
    //will be changed to 1
    public Circle(double radius){
        if (radius < 0){
            radius = 1;
        }
        this.radius = radius;
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
