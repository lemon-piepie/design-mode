package com.company.statemode;

public class Main {

    public static void main(String[] args) {
	    ThreadContext context = new ThreadContext();

	    context.start();
	    context.getCPU();
	    context.suspend();
	    context.resume();
	    context.getCPU();
	    context.stop();
    }
}
