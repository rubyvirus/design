package com.whatistest.adapter;

/**
 * Created by rubyvirusqq@gmail.com on 2017/3/9.
 * 适配类：适配者即被适配的角色，它定义了一个已经存在的接口，这个接口需要适配，适配者类一般是一个具体类，包含了客户希望使用的业务方法，在某些情况下可能没有适配者类的源代码。
 */
public class Adaptee {
    public void sampleOperation1() {
        System.out.println("i'm sampleOperation1.");
    }

    public void sampleOpertaion2() {

    }
}
