package org.simplefactory.demo2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryTest {

    @Test
    void createShape() throws UnsupportedShapeException {
        Shape r = ShapeFactory.createShape("R");
        assertTrue(r instanceof Rectangle);

        Shape c = ShapeFactory.createShape("C");
        assertTrue(c instanceof Circle);

        Shape t = ShapeFactory.createShape("T");
        assertTrue(t instanceof Triangle);
    }

    @Test
    void createShape_throw() {
        assertThrows(UnsupportedShapeException.class,()->ShapeFactory.createShape("a"));
    }
}