package com.company.templatemode;

//具体子类
public class Monday extends DailyAffair {

    @Override
    protected void breakfast() {
        System.out.println("早餐自治三明治");
    }

    @Override
    protected void lunch() {
        System.out.println("午餐食堂吃");
    }

    @Override
    protected void dinner() {
        System.out.println("晚餐点外卖");
    }
}
