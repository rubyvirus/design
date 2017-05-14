package com.whatistest.bridge;

/**
 * Created by rubyvirusqq@gmail.com on 14/05/17.
 */
public class LinuxImp implements ImageImpl {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("在Linux操作系统中显示图像.");
    }
}
