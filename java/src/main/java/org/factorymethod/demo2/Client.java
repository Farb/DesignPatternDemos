package org.factorymethod.demo2;

public class Client {
    public static DataFormatter getDataFormatter() {
        // 假设可以从配置文件通过反射灵活读取具体的工厂类型
        DataFormatterFactory factory = new ExcelDataFormatterFactory();
        DataFormatter dataFormatter = factory.createDataFormatter();
        return dataFormatter;
    }
}
