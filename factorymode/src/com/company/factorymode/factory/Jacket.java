package com.company.factorymode.factory;

public class Jacket implements ClothesProduct{

    @Override
    public void create() {
        System.out.println("生产了一件夹克");
    }
}
