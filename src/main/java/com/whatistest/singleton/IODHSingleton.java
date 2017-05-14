package com.whatistest.singleton;

/**
 * 通过内部类方式方式，解决资源占用与线程不完全问题，其它语言可能不支持
 * Created by rubyvirusqq@gmail.com on 2017/3/2.
 */
public class IODHSingleton {
    private IODHSingleton() {

    }

    private static class IODHInsideSingleton {
        private final static IODHSingleton iodhSingleton = new IODHSingleton();
    }

    public IODHSingleton getIdhSingleton() {
        return IODHInsideSingleton.iodhSingleton;
    }
}
