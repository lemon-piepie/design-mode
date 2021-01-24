package com.company.buildermode;

public class MaleBuilder implements CharacterBuilder{

    private Character male = new Character();

    @Override
    public void buildHairCut() {
        male.setHairCut("短发");
        System.out.println("男性角色添加短发模型");
    }

    @Override
    public void buildFace() {
        male.setFace("国字脸");
        System.out.println("男性角色添加国字脸模型");
    }

    @Override
    public void buildClothes() {
        male.setClothes("运动装");
        System.out.println("男性角色添加运动装模型");
    }

    @Override
    public void buildOrnaments() {
        male.setOrnaments("手表");
        System.out.println("男性角色添加手表模型");
    }

    @Override
    public Character getCharacter() {
        return male;
    }
}
