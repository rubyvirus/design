package com.whatistest.clonemodel.singleton;

/**
 * 饿汉式单例模式，类被创建就实例化当前类
 * 首次运行很慢，占用资源
 * Created by rubyvirusqq@gmail.com on 2017/3/2.
 */
public class EagerlySingleton {

    private static final EagerlySingleton eagerlySingleton = new EagerlySingleton();

    private EagerlySingleton() {

    }

    public EagerlySingleton getEagerlySingleton() {
        return eagerlySingleton;
    }
}
