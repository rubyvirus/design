package com.whatistest.clonemodel.abstractfactory;

/**
 * Created by rubyvirusqq@gmail.com on 2017/3/1.
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextfield();
    }

    @Override
    public ComboBox createCombobox() {
        return new SummerComboBox();
    }
}
