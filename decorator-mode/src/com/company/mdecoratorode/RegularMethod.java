package com.company.mdecoratorode;

//具体构件角色，这是家常菜的常用做法
public class RegularMethod implements HomeDishes {
    @Override
    public void tomatoEgg() {
        System.out.println("加入少量油，盐");
        System.out.println("加入番茄和鸡蛋后爆炒");
    }

    @Override
    public void redMeat() {
        System.out.println("炖肉");
        System.out.println("加入酱油，白糖后翻炒已熟的肉");
    }
}
