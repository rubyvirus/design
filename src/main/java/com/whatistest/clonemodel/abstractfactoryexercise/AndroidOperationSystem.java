package com.whatistest.clonemodel.abstractfactoryexercise;

/**
 * Created by rubyvirusqq@gmail.com on 2017/3/2.
 */
public class AndroidOperationSystem implements OperationSystem{
    @Override
    public InterfaceController createInterfaceController() {
        return new AndroidInterfaceController();
    }

    @Override
    public OperationController createOperationController() {
        return new AndroidOperationController();
    }
}
