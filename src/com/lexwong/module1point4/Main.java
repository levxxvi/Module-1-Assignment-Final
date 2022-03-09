package com.lexwong.module1point4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*prints out the two classes Triangle and Circle with their important
        attributes and area*/
        ArrayList<TwoDShape> shapes = new ArrayList<>();
        shapes.add(new Triangle(10,10));
        shapes.add(new Circle(5));
        for (TwoDShape s : shapes) {
            System.out.println(s);
        }

}
}
