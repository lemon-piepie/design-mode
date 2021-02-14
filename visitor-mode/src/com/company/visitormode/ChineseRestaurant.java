package com.company.visitormode;

//具体访问者：中餐馆
public class ChineseRestaurant implements Restaurant{
    @Override
    public String cook(Potato potato) {
        return "炝拌土豆丝";
    }

    @Override
    public String cook(Vegetable vegetable) {
        return "炒合菜";
    }
}
