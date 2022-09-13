package org.simplefactory.demo2;

public class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("draw a rectangle");
    }

    @Override
    public void erase() {
        System.out.println("erase from rectangle");
    }
}
