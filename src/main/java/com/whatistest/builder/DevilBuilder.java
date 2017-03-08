package com.whatistest.builder;

/**
 * Created by rubyvirusqq@gmail.com on 2017/3/8.
 */
public class DevilBuilder extends ActorBuider {
    @Override
    public void buildType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("黑脸");
    }

    @Override
    public void buildConstume() {
        actor.setConsume("");
    }

    @Override
    public void buildHairStyle() {
        actor.setHairStyle("黑色");
    }
}
