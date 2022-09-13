package org.simplefactory.demo2;

public class ShapeFactory {
    public  static Shape createShape(String args) throws UnsupportedShapeException {
        if (args=="C") return new Circle();
        if (args=="R") return new Rectangle();
        if (args=="T") return new Triangle();
        throw new UnsupportedShapeException(args);
    }
}
