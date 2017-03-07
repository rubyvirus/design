package com.whatistest.clonemodel.simplefactory;

import org.junit.Test;

/**
 * Created by rubyvirusqq@gmail.com on 2017/2/24.
 */
public class TestSimpleCarFactory {

    @Test
    public void TestGetSimpleCar() {
        SimpleCarFactory simpleCarFactory = new SimpleCarFactory();
        simpleCarFactory.getSimpleCar("truck").getCarName();
    }
}
