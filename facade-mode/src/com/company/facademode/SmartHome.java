package com.company.facademode;

//外观角色
public class SmartHome {
    private Lamp lamp = new Lamp();
    private AirConditioner airConditioner = new AirConditioner();
    private Television television = new Television();

    public void control() {
        lamp.open();
        lamp.close();
        airConditioner.open();
        airConditioner.close();
        television.open();
        television.close();
    }
}
