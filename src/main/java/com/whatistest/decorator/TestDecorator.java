package com.whatistest.decorator;

/**
 * Created by rubyvirusqq@gmail.com on 14/05/17.
 */
public class TestDecorator {

    public static void main(String[] args) {
        Component component, component1, component2;
        component = new Window();
        component1 = new ScrollBarDecorator(component);
        component2 = new BlackBorderDecorator(component1);

        component2.display();
    }
}
