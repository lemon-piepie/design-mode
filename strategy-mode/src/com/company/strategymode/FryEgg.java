package com.company.strategymode;

//具体策略类：煎鸡蛋
public class FryEgg implements CookEggs{
    @Override
    public void CookingMethod() {
        System.out.println("煎鸡蛋");
    }
}
