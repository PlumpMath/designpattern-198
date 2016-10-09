package com.liuwei.designpattern.builder;

public class HeroBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("英雄");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("帅气");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("铠甲");
    }

    @Override
    public void buildHair() {
        actor.setHairstyle("帅气短发");
    }
}
