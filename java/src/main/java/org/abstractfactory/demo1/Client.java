package org.abstractfactory.demo1;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new HaierFactory();
        AirCondition airCondition = factory.createAirCondition();
        airCondition.show();
        Television television = factory.createTelevision();
        television.show();
    }
}
