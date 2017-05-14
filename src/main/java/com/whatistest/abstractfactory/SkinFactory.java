package com.whatistest.abstractfactory;

/**
 * 抽象工厂模式
 * Created by rubyvirusqq@gmail.com on 2017/3/1.
 */
public interface SkinFactory {
    Button createButton();

    TextField createTextField();

    ComboBox createCombobox();
}
