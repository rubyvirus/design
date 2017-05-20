package com.whatistest.FlyWeight;

/**
 * Created by rubyvirusqq@gmail.com on 20/05/17.
 */
public abstract class IgoChessman {

    public abstract String getColor();

    public void display() {
        System.out.println("我的颜色是： " + this.getColor());
    }
}
