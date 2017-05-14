package com.whatistest.abstractfactoryexercise;

/**
 * Created by rubyvirusqq@gmail.com on 2017/3/2.
 */
public interface OperationSystem {
    InterfaceController createInterfaceController();

    OperationController createOperationController();
}
