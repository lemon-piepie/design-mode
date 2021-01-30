package com.company.strategymode;

//具体策略类：鸡蛋汤
public class EggSoup implements CookEggs{
    @Override
    public void CookingMethod() {
        System.out.println("紫菜蛋花汤");
    }
}
