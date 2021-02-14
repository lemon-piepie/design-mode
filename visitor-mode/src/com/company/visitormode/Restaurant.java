package com.company.visitormode;

//抽象访问者：饭店
public interface Restaurant {

    //用土豆进行烹饪
    public String cook(Potato potato);

    //用蔬菜进行烹饪
    public String cook(Vegetable vegetable);
}
