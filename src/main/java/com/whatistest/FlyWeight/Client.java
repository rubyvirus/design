package com.whatistest.FlyWeight;

/**
 * Created by rubyvirusqq@gmail.com on 20/05/17.
 */
public class Client {

    public static void main(String[] args) {
        IgoChessmanFactory igoChessmanFactory;
        IgoChessman b1, b2, w1, w2;
        igoChessmanFactory = IgoChessmanFactory.getInstance();

        b1 = igoChessmanFactory.getIgoChessman("b");
        b2 = igoChessmanFactory.getIgoChessman("b");
        w1 = igoChessmanFactory.getIgoChessman("w");
        w2 = igoChessmanFactory.getIgoChessman("w");

        b1.display();
        b2.display();
        w1.display();
        w2.display();
    }
}
