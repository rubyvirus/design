package com.whatistest.clonemodel.abstractfactory;

import org.junit.Test;

/**
 * Created by rubyvirusqq@gmail.com on 2017/3/1.
 */
public class TestSkinFactory {

    @Test
    public void TestSkinFactory(){
        SkinFactory skinFactory;
        Button button;
        TextField textField;
        ComboBox comboBox;

        skinFactory = new SpringSkinFactory();
        skinFactory.createButton().display();
    }
}
