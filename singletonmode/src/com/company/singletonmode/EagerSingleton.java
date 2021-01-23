package com.company.singletonmode;

public class EagerSingleton {
    //类内创建唯一的对象
    private static final EagerSingleton instance = new EagerSingleton();

    //构造方法私有化，不允许外部直接创建对象
    private EagerSingleton(){

    }

    //提供一个获取实例的方法
    public static EagerSingleton getInstance() {
        return instance;
    }
}
