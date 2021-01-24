package com.company.buildermode;

//抽象建造者
public interface CharacterBuilder {

    public abstract void buildHairCut();

    public abstract void buildFace();

    public abstract void buildClothes();

    public abstract void buildOrnaments();

    public abstract Character getCharacter();
}
