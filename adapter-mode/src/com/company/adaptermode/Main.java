package com.company.adaptermode;

public class Main {

    public static void main(String[] args) {
	    System.out.println("二相头使用三相头插座测试：");
	    Adapter adapter = new Adapter();
	    adapter.charge();
	    adapter.use();
    }
}
