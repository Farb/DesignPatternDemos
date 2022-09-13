package org.factorymethod.demo1;

public class BenzFactory implements CarFactory{
    @Override
    public Car creatCar() {
        return new BenzCar();
    }
}
