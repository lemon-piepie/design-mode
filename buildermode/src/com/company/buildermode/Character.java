package com.company.buildermode;

//这是玩家player创建的角色模型
//包括发型，脸型，服饰，配饰等
public class Character {
    private String hairCut;
    private String face;
    private String clothes;
    private String ornaments;

    public String getHairCut() {
        return hairCut;
    }

    public void setHairCut(String hairCut) {
        this.hairCut = hairCut;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    public String getOrnaments() {
        return ornaments;
    }

    public void setOrnaments(String ornaments) {
        this.ornaments = ornaments;
    }

    @Override
    public String toString() {
        return "Character{" +
                "hairCut='" + hairCut + '\'' +
                ", face='" + face + '\'' +
                ", clothes='" + clothes + '\'' +
                ", ornaments='" + ornaments + '\'' +
                '}';
    }
}
