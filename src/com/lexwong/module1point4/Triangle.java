package com.lexwong.module1point4;

public class Triangle extends TwoDShape {
    double side1;
    double side2;
    //base is side 3
    double side3;
    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Triangle(double side1, double side2,double side3){}

    class RotateTriangle implements rotate {
        @Override
        public void rotate90() {

        }

        @Override
        public void rotate180() {
            
        }

        @Override
        public void rotate(double degree) {

        }
    }

    private double heronsHeight(){
        getArea();
        double h = getArea()*2*side3;
        return h;
    }

    public double getArea(){
        double num = width * height;
        double area = num / 2;
        return area;

    }

    @Override
    public String toString() {
        return "Triangle has: " +
                "base = " + width +
                ", and height = " + height +
                ". The area of the triangle is: " + this.getArea();
    }
}
