package com.whatistest.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rubyvirusqq@gmail.com on 14/05/17.
 */
public class Folder extends AbstractFile {
    private String name;

    private List<AbstractFile> abstractFileList = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void add(AbstractFile abstractFile) {
        abstractFileList.add(abstractFile);
    }

    @Override
    void move(AbstractFile abstractFile) {
        abstractFileList.remove(abstractFile);
    }

    @Override
    AbstractFile getChild(int i) {
        return abstractFileList.get(i);
    }

    @Override
    void killVirus() {
        System.out.println("正在对" + name + "文件夹查杀");
        for (AbstractFile abstractFile : abstractFileList) {
            abstractFile.killVirus();
        }
    }
}
