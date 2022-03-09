package com.lexwong.module1point4;

public class Triangle extends TwoDShape {
    double side1;
    double side2;
    //base is side 3
    double side3;

    public Triangle(double width, double height){
        super(width, height);
        this.width = width;
        this.height = height;
    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        heronsHeight(side1, side2, side3);
    }

    class RotateTriangle implements rotate {
        @Override
        public void rotate90() {}

        @Override
        public void rotate180() {}

        @Override
        public void rotate(double degree) {}
    }

    /**
     *Uses Heron's Formula of A = √s(s-a)(s-b)(s-c) and A = 1/2bh to
     * find height when given the three sides of a triangle
     * @return the height of a triangle with three non-equal sides
     */
    public double heronsHeight(double side1, double side2, double side3){
        getArea(side1, side2, side3);
        double h = getArea()*2/side3;
        return h;
    }

    //finds the area when given three sides of a triangle
    public double getArea(double side1, double side2, double side3){
        double s = (side1+side2+side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }

    //finds the area when given only base and height of the triangle
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
