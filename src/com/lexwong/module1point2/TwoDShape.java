package com.lexwong.module1point2;

import java.util.ArrayList;

public class TwoDShape {
    double width;
    double height;
    public TwoDShape(double width, double height){}
    public TwoDShape(){}
    public double getArea(){
        double area = width*height;
        return area;
    }
    public void setHeight(double height){}

    public static void main(String[] args) {
        ArrayList<String> shapes = new ArrayList<String>();
        shapes.add(String.valueOf(new Triangle(1,1)));
        shapes.add(String.valueOf(new Circle(1)));
        System.out.println(shapes);
    }
}
