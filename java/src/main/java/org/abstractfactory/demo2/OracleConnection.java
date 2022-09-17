package org.abstractfactory.demo2;

public class OracleConnection implements Connection {
    @Override
    public void show() {
        System.out.println("this is OracleConnection");
    }
}
