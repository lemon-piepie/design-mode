package com.company.adaptermode;

public class Main {

    public static void main(String[] args) {
	    System.out.println("类适配器模式，二相头使用三相头插座测试：");
	    Adapter adapter = new Adapter();
	    adapter.charge();
	    adapter.use();

	    System.out.println("******************************");

		System.out.println("对象适配器模式，二相头使用三相头插座测试：");
		TwoPinPlug twoPinPlug = new TwoPinPlug();
		ObjectAdapter objectAdapter = new ObjectAdapter(twoPinPlug);
		objectAdapter.charge();
		objectAdapter.use();
    }
}
