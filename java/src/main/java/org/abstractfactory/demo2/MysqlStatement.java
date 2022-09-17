package org.abstractfactory.demo2;

public class MysqlStatement implements Statement {
    @Override
    public void show() {
        System.out.println("this is MysqlStatement");
    }
}
