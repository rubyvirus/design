package com.whatistest.bridge;

/**
 * Created by rubyvirusqq@gmail.com on 14/05/17.
 * <p>
 * https://gof.quanke.name/%E5%A4%84%E7%90%86%E5%A4%9A%E7%BB%B4%E5%BA%A6%E5%8F%98%E5%8C%96%E2%80%94%E2%80%94%E6%A1%A5%E6%8E%A5%E6%A8%A1%E5%BC%8F%EF%BC%88%E4%B8%80%EF%BC%89.html
 */
public abstract class Image {

    protected ImageImpl image;

    public void setImage(ImageImpl image) {
        this.image = image;
    }

    abstract void parseFile(String fileName);
}
