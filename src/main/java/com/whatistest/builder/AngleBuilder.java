package com.whatistest.builder;

/**
 * Created by rubyvirusqq@gmail.com on 2017/3/8.
 */
public class AngleBuilder extends ActorBuider {
    @Override
    public void buildType() {
        actor.setType("天使");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildFace() {
        actor.setFace("粉白");
    }

    @Override
    public void buildConstume() {
        actor.setConsume("");
    }

    @Override
    public void buildHairStyle() {
        actor.setHairStyle("棕色");
    }
}
