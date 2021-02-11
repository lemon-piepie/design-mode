package com.company.statemode;

//具体状态类：线程的阻塞状态
public class Blocked extends ThreadState{
    public Blocked() {
        stateName = "阻塞状态";
        System.out.println("当前线程处于：阻塞状态");
    }

    @Override
    public void transition(ThreadContext context) {
        System.out.println("阻塞状态的线程调用状态跳转方法，跳转至");
        if (stateName.equals("阻塞状态")) {
            context.setState(new Runnable());
        }
    }
}
