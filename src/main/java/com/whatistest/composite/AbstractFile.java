package com.whatistest.composite;

/**
 * Created by rubyvirusqq@gmail.com on 14/05/17.
 * https://gof.quanke.name/%E6%A0%91%E5%BD%A2%E7%BB%93%E6%9E%84%E7%9A%84%E5%A4%84%E7%90%86%E2%80%94%E2%80%94%E7%BB%84%E5%90%88%E6%A8%A1%E5%BC%8F%EF%BC%88%E4%BA%8C%EF%BC%89.html
 */
abstract class AbstractFile {

    abstract void add(AbstractFile abstractFile);

    abstract void move(AbstractFile abstractFile);

    abstract AbstractFile getChild(int i);

    abstract void killVirus();

}
