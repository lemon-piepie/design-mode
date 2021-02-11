package com.company.statemode;

//环境类：内部维护一个当前状态，负责具体状态的切换
public class ThreadContext {
    private ThreadState state;

    ThreadContext() {
        state = new Create();
    }


    public ThreadState getState() {
        return state;
    }

    public void setState(ThreadState state) {
        this.state = state;
    }

    public void start() {
        ((Create) state).transition(this);
    }

    public void getCPU() {
        ((Runnable) state).transition(this);
    }

    public void suspend() {
        ((Running) state).suspend(this);
    }

    public void stop() {
        ((Running) state).transition(this);
    }

    public void resume() {
        ((Blocked) state).transition(this);
    }
}
