package com.whatistest.abstractfactory;

/**
 * Created by rubyvirusqq@gmail.com on 2017/3/1.
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createCombobox() {
        return new SpringComboBox();
    }
}
