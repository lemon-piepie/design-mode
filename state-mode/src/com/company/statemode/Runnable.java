package com.company.statemode;

//具体状态类：线程的就绪状态
public class Runnable extends ThreadState{
    public Runnable() {
        stateName = "就绪状态";
        System.out.println("当前线程处于：就绪状态");
    }

    @Override
    public void transition(ThreadContext context) {
        System.out.println("就绪状态的线程调用状态跳转方法，跳转至");
        if (stateName.equals("就绪状态")){
            context.setState(new Running());
        }
    }
}
