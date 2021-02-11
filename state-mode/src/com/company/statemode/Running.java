package com.company.statemode;

//具体状态类：线程的运行状态
public class Running extends ThreadState {
    public Running() {
        stateName = "运行状态";
        System.out.println("当前线程处于：运行状态");
    }

    @Override
    public void transition(ThreadContext context) {
        System.out.println("运行状态的线程调用状态跳转方法，跳转至");
        if (stateName.equals("运行状态")) {
            context.setState(new Dead());
        }
    }

    public void suspend(ThreadContext context) {
        System.out.println("运行状态的线程调被阻塞，跳转至");
        if (stateName.equals("运行状态")) {
            context.setState(new Blocked());
        }
    }
}
