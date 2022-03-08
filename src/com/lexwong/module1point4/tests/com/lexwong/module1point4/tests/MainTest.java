package com.lexwong.module1point4.tests;

import org.junit.Test;

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

    }
    @Test public void test123zero(){
        //side1 = 0, side2 = 2, side3 = 2, s = 2
        assertEquals(Math.sqrt(2*(2-0)*(2-2)*(2-2)), heronsHeight(0, 2, 2));
    }
}