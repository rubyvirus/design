package com.whatistest.methodfactory;

/**
 * Created by rubyvirusqq@gmail.com on 2017/2/26.
 */
public class FileLogger implements Logger {
    @Override
    public String writeLogger() {
        return "我正在打印文件日志！！！";
    }
}
