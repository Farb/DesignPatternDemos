package org.factorymethod.demo1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ClientTest {

    @Test
    void drive() {
        Car car = Client.drive();
        assertTrue(car instanceof BmwCar);
    }
}