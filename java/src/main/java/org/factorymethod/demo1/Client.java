package org.factorymethod.demo1;

public class Client {
    public static Car drive() {
        // 假设BmwFactory是从配置文件读取并发射生成的工厂对象，那么新增产品和产品工厂时，完全符合OCP原则。
        CarFactory factory = new BmwFactory();
        Car car = factory.creatCar();
        car.drive();
        return car;
    }
}
