package com.whatistest.adapter;

/**
 * Created by rubyvirusqq@gmail.com on 2017/3/9.
 */
public class Client {
    private static Target objectAdapter = new ObjectAdapter();

    public static void main(String[] args) {
        // 间接调用Adaptee中的功能
        objectAdapter.sampleOperation1();
    }
}
