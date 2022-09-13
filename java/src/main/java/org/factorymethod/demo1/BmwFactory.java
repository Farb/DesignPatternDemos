package org.factorymethod.demo1;

public class BmwFactory implements CarFactory{
    @Override
    public Car creatCar() {
        return new BmwCar();
    }
}
