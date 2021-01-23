package com.company.singletonmode;

public class Main {

    public static void main(String[] args) {
        eager();
        lazy();
    }

    private static void eager() {
        System.out.println("——————————使用饿汉模式创建实例——————————");
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton anotherEagerSingleton = EagerSingleton.getInstance();
        if (eagerSingleton == anotherEagerSingleton) {
            System.out.println("饿汉模式创建的实例是同一个实例");
        } else {
            System.out.println("饿汉模式创建的实例不是同一个实例");
        }
    }

    private static void lazy() {
        System.out.println("——————————使用懒汉模式创建实例——————————");
        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton anotherLazySingleton = LazySingleton.getInstance();
        if (lazySingleton == anotherLazySingleton) {
            System.out.println("懒汉模式创建的实例是同一个实例");
        } else {
            System.out.println("懒汉模式创建的实例不是同一个实例");
        }
    }
}
