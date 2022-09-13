package org.simplefactory.demo2;

public class UnsupportedShapeException extends Exception{
    private String sharpArg;

    public UnsupportedShapeException( String sharpArg) {
        this.sharpArg = sharpArg;
    }

    @Override
    public String toString() {
        return "UnsupportedShapeException{" +
                "sharpArg='" + sharpArg + '\'' +
                '}';
    }
}
