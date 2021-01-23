package com.company.factorymode.factory;

public class TShirt implements ClothesProduct{

    @Override
    public void create() {
        System.out.println("生产了一件T恤");
    }
}
