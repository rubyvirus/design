package com.whatistest.builder;

/**
 * Created by rubyvirusqq@gmail.com on 2017/3/8.
 */
public class ActorController {
    public Actor construct(ActorBuider actorBuider) {
        Actor actor;
        actorBuider.buildType();
        actorBuider.buildSex();
        actorBuider.buildFace();
        actorBuider.buildConstume();
        actorBuider.buildHairStyle();
        actor = actorBuider.createActor();
        return actor;
    }
}
