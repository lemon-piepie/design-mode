package com.company.visitormode;

//具体访问类：西餐厅
public class WesternRestaurant implements Restaurant{
    @Override
    public String cook(Potato potato) {
        return "炸薯条";
    }

    @Override
    public String cook(Vegetable vegetable) {
        return "蔬菜沙拉";
    }
}
