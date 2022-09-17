package org.abstractfactory.demo2;

public class MysqlConnection implements Connection {
    @Override
    public void show() {
        System.out.println("this is MysqlConnection");
    }
}
