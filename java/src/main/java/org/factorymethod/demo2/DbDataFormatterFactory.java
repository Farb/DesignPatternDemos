package org.factorymethod.demo2;

public class DbDataFormatterFactory extends DataFormatterFactory {
    @Override
    DataFormatter createDataFormatter() {
        return new DbDataFormatter();
    }
}
