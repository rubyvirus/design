package com.whatistest.adapter;

/**
 * 对象适配模式
 * Created by rubyvirusqq@gmail.com on 2017/3/9.
 */
public class ObjectAdapter {
    private Adaptee adaptee;

    public ObjectAdapter() {
        this.adaptee = new Adaptee();
    }

    public void sampleOperation1() {
        adaptee.sampleOperation1();
    }

    public void sampleOperation2() {

    }
}
