package org.factorymethod.demo2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ClientTest {

    @Test
    void dataFormat() {
        // 假设可以通过配置文件和反射获取
        DataFormatter dataFormatter = Client.getDataFormatter();
        assertTrue(dataFormatter instanceof ExcelDataFormatter);
        dataFormatter.format();
    }
}