package com.whatistest.clonemodel.methodfactory;

/**
 * Created by rubyvirusqq@gmail.com on 2017/2/26.
 */
public class DatabaseLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
