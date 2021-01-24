package com.company.buildermode;

//指挥者
public class Player {

    CharacterBuilder builder;

    public Player(CharacterBuilder builder) {
        this.builder = builder;
    }

    public void getResult() {
        builder.buildHairCut();
        builder.buildFace();
        builder.buildClothes();
        builder.buildOrnaments();
    }
}
