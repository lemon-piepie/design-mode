package com.company.mdecoratorode;

//抽象装饰：这是与常规家常菜不同的做法，需要注入构件角色
public class DifferentMethod implements HomeDishes {

    private final HomeDishes homeDishes;

    public DifferentMethod(HomeDishes homeDishes) {
        this.homeDishes = homeDishes;
    }

    @Override
    public void tomatoEgg() {
        homeDishes.tomatoEgg();
    }

    @Override
    public void redMeat() {
        homeDishes.redMeat();
    }
}
