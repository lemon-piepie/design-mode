package com.company.bridgemode;

//扩展抽象化角色：微软xbox游戏机
public class Xbox extends GamePlayer{
    @Override
    public String play() {
        return "正在玩" + color.getColor() + "的微软xbox游戏机";
    }
}
