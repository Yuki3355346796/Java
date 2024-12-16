package com.HJK.hello;

public class Circle2 {
    double radius;

    static int numberOfObjects=0;

    Circle2(){
        radius=1;
        numberOfObjects++;
    }

    static int getNumberOfObjects(){
        return numberOfObjects;
    }

    double getArea(){
        return radius*radius*Math.PI;
    }
}
