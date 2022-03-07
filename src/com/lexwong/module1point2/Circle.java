package com.lexwong.module1point2;

public class Circle extends TwoDShape{
    public final double Pi = 3.14159265;
    private double radius;
    Circle (double radius){}
    public double getArea(){
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Pi=" + Pi +
                ", radius=" + radius +
                '}';
    }

    /*@Override
    public String toString() {
        return "Circle{" +
                "Pi=" + Pi +
                ", radius=" + radius +
                '}';
    }*/
}
