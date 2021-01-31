package com.company.mdecoratorode;

//具体装饰，这是不同的西红柿炒鸡蛋方法
public class DifferentTomatoEgg extends DifferentMethod {

    public DifferentTomatoEgg(HomeDishes homeDishes) {
        super(homeDishes);
    }

    public void tomatoEgg(){
        super.tomatoEgg();
        addMore();
    }

    private void addMore() {
        System.out.println("出锅前加入少许白糖");
    }
}
