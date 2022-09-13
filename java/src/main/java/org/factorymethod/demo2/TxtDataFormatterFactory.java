package org.factorymethod.demo2;

public class TxtDataFormatterFactory extends DataFormatterFactory {
    @Override
    DataFormatter createDataFormatter() {
        return new TxtDataFormatter();
    }
}
