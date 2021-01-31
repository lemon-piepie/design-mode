package com.company.mdecoratorode;

//具体装饰，这是不同的红烧肉方法
public class DifferentRedMeat extends DifferentMethod {

    public DifferentRedMeat(HomeDishes homeDishes) {
        super(homeDishes);
    }

    public void redMeat(){
        super.redMeat();
        addMore();
    }

    private void addMore() {
        System.out.println("加入少量啤酒，使肉更加有嚼劲");
    }
}
