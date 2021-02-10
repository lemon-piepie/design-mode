package com.company.bridgemode;

//抽象化角色：游戏机
public abstract class GamePlayer {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor(){
        return color;
    }

    public abstract String play();
}
