package com.whatistest.facade.first;

/**
 * Created by rubyvirusqq@gmail.com on 20/05/17.
 */
public class Client {

    private static Facade facade;


    public static void main(String[] args) {
        facade = new Facade();
        facade.Method();
    }

}
