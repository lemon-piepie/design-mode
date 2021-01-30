package com.company.strategymode;

//具体策略类：西红柿炒鸡蛋
public class TomatoEgg implements CookEggs{
    @Override
    public void CookingMethod() {
        System.out.println("西红柿炒鸡蛋");
    }
}
