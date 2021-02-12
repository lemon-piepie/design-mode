package com.company.mediatormode;

//抽象同事类：聊天平台的用户
public abstract class User {
    protected Platform medium;
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public void setMedium(Platform platform) {
        this.medium = platform;
    }

    public abstract void receive(String sender, String content);

    public abstract void send(String content);

    public String getName() {
        return this.name;
    }
}
