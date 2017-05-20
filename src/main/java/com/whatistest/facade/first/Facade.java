package com.whatistest.facade.first;

/**
 * Created by rubyvirusqq@gmail.com on 20/05/17.
 */
public class Facade {

    private SubSystemA subSystemA;
    private SubSystemB subSystemB;
    private SubSystemC subSystemC;

    public Facade() {
        subSystemA = new SubSystemA();
        subSystemB = new SubSystemB();
        subSystemC = new SubSystemC();
    }

    public void Method() {
        subSystemA.MethodA();
        subSystemB.MethodB();
        subSystemC.MethodC();
    }
}
