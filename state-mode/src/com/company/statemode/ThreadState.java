package com.company.statemode;

//抽象状态类：线程，包括创建/就绪/运行/阻塞/死亡这几种状态
public abstract class ThreadState {
    protected String stateName;

    public abstract void transition(ThreadContext context);
}
