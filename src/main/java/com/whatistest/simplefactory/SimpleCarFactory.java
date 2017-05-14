package com.whatistest.simplefactory;

/**
 * 简单工厂模式
 * Created by rubyvirusqq@gmail.com on 2017/2/24.
 */
public class SimpleCarFactory {

    Car getSimpleCar(String carType) {
        Car car;
        if (carType.equalsIgnoreCase("jeep")) {
            car = new Jeep();
        } else if (carType.equalsIgnoreCase("Truck")) {
            car = new Truck();
        } else {
            car = null;
        }
        return car;
    }
}
