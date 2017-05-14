package com.whatistest.composite;

/**
 * Created by rubyvirusqq@gmail.com on 14/05/17.
 */
public class TextFile extends AbstractFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void add(AbstractFile abstractFile) {
        System.out.println("不支持该文件");
    }

    @Override
    void move(AbstractFile abstractFile) {
        System.out.println("不支持该文件");
    }

    @Override
    AbstractFile getChild(int i) {
        System.out.println("不支持该文件");
        return null;
    }

    @Override
    void killVirus() {
        System.out.println("正在查杀" + name);
    }
}
