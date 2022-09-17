package org.abstractfactory.demo2;

public class MysqlFactory implements AbstractFactory {
    @Override
    public Connection createConnection() {
        return new MysqlConnection();
    }

    @Override
    public Statement createStatement() {
        return new MysqlStatement();
    }
}
