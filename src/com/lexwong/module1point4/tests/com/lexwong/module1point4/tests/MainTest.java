package com.lexwong.module1point4.tests;

import com.lexwong.module1point4.Circle;
import com.lexwong.module1point4.Triangle;
import org.junit.Test;

import java.nio.channels.Pipe;

import static org.junit.Assert.*;

public class MainTest {
    //partition
    /*
        testing heron's height
        side1, side2, side3 are all big numbers
        side1, side2, or side3 is 0
        side1, side2, or side3 is a negative number
     */
    @Test public void test123big(){
        //side1 = 195, side2 = 645, side3 = 713, s = 776.5
        Triangle triangle = new Triangle(195, 645, 713);
        assertEquals((Math.sqrt(776.5*(776.5-195)*(776.5-645)*(776.5-713)))*2/713,
                triangle.heronsHeight(195, 645, 713), 0);

    }

    @Test public void test123zero(){
        //side1 = 0, side2 = 2, side3 = 2, s = 2
        Triangle triangle = new Triangle(0, 2, 2);
        assertEquals(0, triangle.heronsHeight(0, 2, 2), 0);
    }

    @Test public void test123neg(){
        //side 1 = -1, side2 = 2, side3 = 2, s = 1.5
        Triangle triangle = new Triangle(-1, 2, 2);
        assertEquals();
    }

    //partition
    /*
        testing getArea of a circle
        radius is 0
        radius is a negative number
        radius is 1
     */
    @Test public void testradiuszero(){
        //radius = 0
        Circle circle = new Circle(0);
        assertEquals(0, circle.getArea(), 0);
    }

    @Test public void testradiusneg(){
        //radius = -1
        Circle circle = new Circle(-1);
        assertEquals(3.14159265, circle.getArea(), 0);
    }
}