package com.whatistest.decorator;

/**
 * Created by rubyvirusqq@gmail.com on 14/05/17.
 */
public class ScrollBarDecorator extends ComponentDecorator {
    ScrollBarDecorator(Component component) {
        super(component);
    }

    void display() {
        this.setScrollBar();
        super.display();
    }

    void setScrollBar() {
        System.out.println("为构件增加滚动条！");
    }
}
