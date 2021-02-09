package com.company.adaptermode;

//对象适配器模式：适配者
public class ObjectAdapter implements ThreePinPlug {

    private TwoPinPlug twoPinPlug;

    public ObjectAdapter(TwoPinPlug twoPinPlug) {
        this.twoPinPlug = twoPinPlug;
    }

    @Override
    public void charge() {
        System.out.println("连接了三相头插座");
        twoPinPlug.chargeByTwoPin();
    }

    @Override
    public void use() {
        System.out.println("连接了三相头插座");
        twoPinPlug.useByTwoPin();
    }
}
