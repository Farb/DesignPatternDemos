package org.abstractfactory.demo1;

public class TclFactory implements AbstractFactory {
    @Override
    public Television createTelevision() {
        return new TclTelevision();
    }

    @Override
    public AirCondition createAirCondition() {
        return new TclAirCondition();
    }
}
