package org.simplefactory.demo2;

public class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("draw a triangle");
    }

    @Override
    public void erase() {
        System.out.println("erase from triangle");
    }
}
