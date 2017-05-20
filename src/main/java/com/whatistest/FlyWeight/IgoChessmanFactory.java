package com.whatistest.FlyWeight;

import java.util.Hashtable;

/**
 * Created by rubyvirusqq@gmail.com on 20/05/17.
 */
public class IgoChessmanFactory {
    public static IgoChessmanFactory igoChessmanFactory = IgoChessmanFacotrys.igos();

    static class IgoChessmanFacotrys {
        public static IgoChessmanFactory igos() {
            return new IgoChessmanFactory();
        }
    }

    private static Hashtable hashtable;

    public IgoChessmanFactory() {
        hashtable = new Hashtable();
        IgoChessman black = new BlockIgoChessman(), white = new WhiteIgoChessman();
        hashtable.put("b", black);
        hashtable.put("w", white);
    }

    public static IgoChessmanFactory getInstance() {
        return igoChessmanFactory;
    }


    public static IgoChessman getIgoChessman(String color) {
        return (IgoChessman) hashtable.get(color);
    }
}
