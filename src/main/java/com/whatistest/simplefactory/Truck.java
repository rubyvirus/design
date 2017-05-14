package com.whatistest.simplefactory;

/**
 * Created by rubyvirusqq@gmail.com on 2017/2/24.
 */
public class Truck implements Car {
    @Override
    public void getCarName() {
        System.out.println("i'm truck car!!!");
    }
}
