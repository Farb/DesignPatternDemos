package org.simplefactory.demo2;

public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("draw a circle");
    }

    @Override
    public void erase() {
        System.out.println("erase from circle");
    }
}
