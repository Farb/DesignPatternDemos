package org.abstractfactory.demo1;

public class HaierFactory implements AbstractFactory {
    @Override
    public Television createTelevision() {
        return new HaierTelevision();
    }

    @Override
    public AirCondition createAirCondition() {
        return new HaierAirCondition();
    }
}
