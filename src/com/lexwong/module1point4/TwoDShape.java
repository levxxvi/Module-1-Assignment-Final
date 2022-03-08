package com.lexwong.module1point4;

public class TwoDShape {
    double width;
    double height;
    Colour colour;
    public TwoDShape(double width, double height, Colour colour){}
    public TwoDShape(){}

    public double getArea(){
        double area = width*height;
        return area;
    }
    public void setHeight(double height){}
}

