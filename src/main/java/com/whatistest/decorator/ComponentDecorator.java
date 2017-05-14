package com.whatistest.decorator;

/**
 * Created by rubyvirusqq@gmail.com on 14/05/17.
 */
public class ComponentDecorator extends Component {

    private Component component;

    ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    void display() {
        component.display();
    }
}
