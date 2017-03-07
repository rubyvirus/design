package com.whatistest.clonemodel.methodfactory;

import org.junit.Test;

/**
 * Created by rubyvirusqq@gmail.com on 2017/2/26.
 */
public class TestLoggerFactory {

    @Test
    public void TestLoggerFactory() {
        LoggerFactory loggerFactory = new DatabaseLoggerFactory();
        System.out.println(loggerFactory.createLogger().writeLogger());
        LoggerFactory loggerFactory1 = new FileLoggerFactory();
        System.out.println(loggerFactory1.createLogger().writeLogger());
    }

    /**
     * 使用反射方式调用
     */
    @Test
    public void TestLoggerFact() {
        try {
            Class c = Class.forName("DatabaseLoggerFactory");
            DatabaseLoggerFactory databaseLoggerFactory = (DatabaseLoggerFactory) c.newInstance();
            System.out.println(databaseLoggerFactory.createLogger().writeLogger());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用反射方式调用
     */
    @Test
    public void TestLoggerFact1() {
        try {
            Class c = Class.forName("FileLoggerFactory");
            FileLoggerFactory fileLoggerFactory = (FileLoggerFactory) c.newInstance();
            fileLoggerFactory.writeLogger();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
