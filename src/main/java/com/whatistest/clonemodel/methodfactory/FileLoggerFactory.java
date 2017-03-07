package com.whatistest.clonemodel.methodfactory;

/**
 * Created by rubyvirusqq@gmail.com on 2017/2/26.
 */
public class FileLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
