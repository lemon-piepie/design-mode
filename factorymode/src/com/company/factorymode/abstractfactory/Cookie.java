package com.company.factorymode.abstractfactory;

public class Cookie implements SnackProduct{

    @Override
    public void createSnack() {
        System.out.println("生产曲奇作为商品");
    }
}
