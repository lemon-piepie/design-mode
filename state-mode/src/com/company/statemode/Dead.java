package com.company.statemode;

//具体状态类：线程的死亡状态
public class Dead extends ThreadState {
    public Dead() {
        stateName = "死亡状态";
        System.out.println("当前线程处于：死亡状态");
    }

    @Override
    public void transition(ThreadContext context) {
        System.out.println("当前线程已处于死亡状态，不能进行状态跳转");
    }
}
