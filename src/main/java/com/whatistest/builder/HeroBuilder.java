package com.whatistest.builder;

/**
 * Created by rubyvirusqq@gmail.com on 2017/3/8.
 */
public class HeroBuilder extends ActorBuider {
    @Override
    public void buildType() {
        actor.setType("英雄");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildFace() {
        actor.setFace("棕色");
    }

    @Override
    public void buildConstume() {
        actor.setConsume("");
    }

    @Override
    public void buildHairStyle() {
        actor.setHairStyle("红色");
    }
}
