package com.company.mediatormode;

public class Main {

    public static void main(String[] args) {
        //创建平台
        Platform platform = new ChatPlatform();
        //创建两个用户
        User userOne = new UserOne("白开水");
        User userTwo = new UserTwo("追风少年");
        //注册用户，用户一和用户二
        platform.register(userOne);
        platform.register(userTwo);
        //调用交互方法
        userOne.send("你好，在吗？");
        System.out.println("*********************");
        userTwo.send("在的，什么事？");
    }
}
