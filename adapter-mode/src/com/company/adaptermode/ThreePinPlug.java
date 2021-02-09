package com.company.adaptermode;

//类适配器模式：目标接口
public interface ThreePinPlug {
    //使用三相头充电
    void charge();

    //电器使用三相头
    void use();
}
