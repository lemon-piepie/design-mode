package com.company.adaptermode;

//类适配器模式：适配者
public class TwoPinPlug {

    public void chargeByTwoPin() {
        System.out.println("二相头充电线连接的手机正在充电");
    }

    public void useByTwoPin() {
        System.out.println("正在使用二相头连接的电吹风");
    }
}
