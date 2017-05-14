package com.whatistest.decorator;

/**
 * Created by rubyvirusqq@gmail.com on 14/05/17.
 */
public class BlackBorderDecorator extends ComponentDecorator {
    BlackBorderDecorator(Component component) {
        super(component);
    }

    void display() {
        this.setBlackBorder();
        super.display();
    }

    void setBlackBorder() {
        System.out.println("为构件增加黑色边框！");
    }

}
