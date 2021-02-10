package com.company.bridgemode;

//扩展抽象化角色：playstation
public class PS extends GamePlayer {
    @Override
    public String play() {
        return "正在玩" + color.getColor() + "的索尼PlayStation游戏机";
    }
}
