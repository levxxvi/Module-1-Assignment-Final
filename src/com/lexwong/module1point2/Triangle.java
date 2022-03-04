package com.lexwong.module1point2;

public class Triangle extends TwoDShape {
    double side1;
    double side2;
    //base is side 3
    double side3;
    public Triangle(double width, double height) {
        super(width, height);
    }
    public Triangle(double side1, double side2,double side3){}

    private double heronsHeight(){
        getArea();
        double h = getArea()*2*side3;
        return h;
    }

    public double getArea(){
        double s;
        s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
