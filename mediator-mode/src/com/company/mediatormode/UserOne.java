package com.company.mediatormode;

//具体同事类：第一个用户
public class UserOne extends User {

    public UserOne(String name) {
        super(name);
    }

    @Override
    public void receive(String sender, String content) {
        System.out.println("用户" + name + "收到消息:" + content);
    }

    @Override
    public void send(String content) {
        System.out.println("用户" + name + "发送消息");
        medium.relay(name, content);
    }
}
