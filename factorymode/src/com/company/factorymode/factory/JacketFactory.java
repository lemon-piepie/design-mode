package com.company.factorymode.factory;

public class JacketFactory implements ClothesFactory{
    @Override
    public ClothesProduct newProduct() {
        System.out.println("由夹克工厂生产新产品");
        return new Jacket();
    }
}
