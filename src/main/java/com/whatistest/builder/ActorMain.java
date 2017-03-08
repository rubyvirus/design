package com.whatistest.builder;

/**
 * Created by rubyvirusqq@gmail.com on 2017/3/8.
 */
public class ActorMain {
    public static void main(String[] args) {
        ActorBuider actorBuider = new AngleBuilder();
        ActorController actorController = new ActorController();
        Actor actor;
        actor = actorController.construct(actorBuider);
        System.out.println(actor.getType() + "的外观：" + actor.getFace());

    }
}
