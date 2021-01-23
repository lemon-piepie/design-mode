package com.company.factorymode.factory;

public class TShirtFactory implements ClothesFactory{
    @Override
    public ClothesProduct newProduct() {
        System.out.println("由T恤工厂生产新产品");
        return new TShirt();
    }
}
