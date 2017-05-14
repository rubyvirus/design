package com.whatistest.composite;

/**
 * Created by rubyvirusqq@gmail.com on 14/05/17.
 */
abstract class AbstractFile {

    abstract void add(AbstractFile abstractFile);

    abstract void move(AbstractFile abstractFile);

    abstract AbstractFile getChild(int i);

    abstract void killVirus();

}
