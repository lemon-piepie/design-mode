package com.company.statemode;

//具体状态类：线程的新建状态
public class Create extends ThreadState{
    public Create() {
        stateName = "新建状态";
        System.out.println("当前线程处于：新建状态");
    }

    @Override
    public void transition(ThreadContext context) {
        System.out.println("新建状态的线程调用状态跳转方法，跳转至");
        if (stateName.equals("新建状态")){
            context.setState(new Runnable());
        }
    }
}
