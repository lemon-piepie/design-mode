package com.company.buildermode;

//具体建造者
//这是创建女性角色模型的建造者
public class FemaleBuilder implements CharacterBuilder{

    private Character female = new Character();

    @Override
    public void buildHairCut() {
        female.setHairCut("长发");
        System.out.println("女性角色添加长发模型");
    }

    @Override
    public void buildFace() {
        female.setFace("瓜子脸");
        System.out.println("女性角色添加瓜子脸模型");
    }

    @Override
    public void buildClothes() {
        female.setClothes("长裙");
        System.out.println("女性角色添加长裙模型");
    }

    @Override
    public void buildOrnaments() {
        female.setOrnaments("发簪");
        System.out.println("女性角色添加发簪模型");
    }

    @Override
    public Character getCharacter() {
        return female;
    }
}
