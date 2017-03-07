package com.whatistest.clonemodel.methodfactory;

/**
 *
 * 工厂方法模式
 * Created by rubyvirusqq@gmail.com on 2017/2/26.
 */
public abstract class LoggerFactory {

    void writeLogger() {
        Logger logger = this.createLogger();
        System.out.println(logger.writeLogger());
    }

    abstract Logger createLogger();
}
