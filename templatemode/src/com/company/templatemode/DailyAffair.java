package com.company.templatemode;

//抽象类
public abstract class DailyAffair {

    public final void prepareDailyAffairTemplate() {
        wakeUp();
        breakfast();
        lunch();

        if (needDinner()) {
            dinner();
        }

        sleep();
    }

    //钩子方法，子类可以自己选择是否去实现
    protected boolean needDinner() {
        return true;
    }

    //具体方法，子类直接继承
    private void wakeUp() {
        System.out.println("早晨起床");
    }

    protected void breakfast() {
    }

    protected void lunch() {
    }

    protected void dinner() {
    }

    private void sleep() {
        System.out.println("早睡");
    }
}
