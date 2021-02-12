package com.company.mediatormode;

import java.util.ArrayList;
import java.util.List;

//具体中介者：聊天平台
public class ChatPlatform implements Platform {

    //List管理同事对象
    private List<User> users = new ArrayList<User>();


    @Override
    public void register(User user) {
        if (!users.contains(user)) {
            users.add(user);
            user.setMedium(this);
        }
    }

    @Override
    public void relay(String sender, String content) {
        for (User user : users) {
            String name = user.getName();
            if (!name.equals(sender)) {
                ((User) user).receive(sender, content);
            }
        }
    }
}
