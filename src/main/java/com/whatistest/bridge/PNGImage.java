package com.whatistest.bridge;

/**
 * Created by rubyvirusqq@gmail.com on 14/05/17.
 */
public class PNGImage extends Image {
    @Override
    void parseFile(String fileName) {
        Matrix m = new Matrix();
        image.doPaint(m);
        System.out.println(fileName + "，格式为PNG");
    }
}
