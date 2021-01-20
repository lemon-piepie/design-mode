package com.company.templatemode;

public class Sunday extends DailyAffair {

    @Override
    protected void breakfast() {
        System.out.println("早餐麦当劳早餐");
    }

    @Override
    protected void lunch() {
        System.out.println("午餐出去吃");
    }

    @Override
    protected boolean needDinner() {
        return false;
    }
}
