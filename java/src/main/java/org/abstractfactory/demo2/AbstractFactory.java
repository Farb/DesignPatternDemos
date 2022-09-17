package org.abstractfactory.demo2;

public interface AbstractFactory {
    Connection createConnection();

    Statement createStatement();
}
