package com.whatistest.bridge;

/**
 * Created by rubyvirusqq@gmail.com on 14/05/17.
 */
public class TestPaint {

    public static Image image = new PNGImage();
    public static ImageImpl imageImpl = new LinuxImp();

    public static void main(String[] args) {
        image.setImage(imageImpl);
        image.parseFile("小龙女");
    }
}
