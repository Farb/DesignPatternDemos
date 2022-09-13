package org.factorymethod.demo2;

public class ExcelDataFormatterFactory extends DataFormatterFactory {
    @Override
    DataFormatter createDataFormatter() {
        return new ExcelDataFormatter();
    }
}
