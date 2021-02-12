package com.company.mediatormode;

//抽象中介者：平台
public interface Platform {
    public void register(User user);

    public void relay(String form, String content);
}
