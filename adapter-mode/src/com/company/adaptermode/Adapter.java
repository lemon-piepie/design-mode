package com.company.adaptermode;

//类适配器模式：适配器
public class Adapter extends TwoPinPlug implements ThreePinPlug {

    @Override
    public void charge() {
        System.out.println("连接了三相头插座");
        chargeByTwoPin();
    }

    @Override
    public void use() {
        System.out.println("连接了三相头插座");
        useByTwoPin();
    }
}
