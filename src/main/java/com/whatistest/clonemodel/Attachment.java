package com.whatistest.clonemodel;

import java.io.Serializable;

/**
 * 复制一个对象，涉及对象的根，一起复制
 * Created by rubyvirusqq@gmail.com on 2017/3/2.
 */
public class Attachment implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download() {
        System.out.println(this.getName() + ": 正在下载文件");
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "name='" + name + '\'' +
                '}';
    }
}
