package com.whatistest.builder;

/**
 * Created by rubyvirusqq@gmail.com on 2017/3/8.
 */
public abstract class ActorBuider {
    protected Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildConstume();

    public abstract void buildHairStyle();

    // 引用钩子方法
    public boolean isBareheaded() {
        return false;
    }

    public Actor createActor() {
        return actor;
    }
}
