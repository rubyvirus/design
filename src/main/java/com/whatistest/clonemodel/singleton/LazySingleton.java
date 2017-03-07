package com.whatistest.clonemodel.singleton;

/**
 * 懒汉式单例模式
 * <p>
 * 双重检查，导致系统业务处理缓慢
 * 实现了延迟加载
 * Created by rubyvirusqq@gmail.com on 2017/3/2.
 */
public class LazySingleton {
    private volatile static LazySingleton lazySingleton = null;

    public LazySingleton getLazySingleton() {
        if (lazySingleton != null) {
            // 多线程，一个线程进来正在创建，另外一个线程进入阻塞队列，但不知道前一个线程是否创建完成，会再次创建一个，添加一个是否创建过这个对象解决这个问题
            synchronized (LazySingleton.class) {
                if (lazySingleton != null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
