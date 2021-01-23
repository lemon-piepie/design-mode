package com.company.factorymode.abstractfactory;

public class Juice implements DrinkProduct{
    @Override
    public void createDrink() {
        System.out.println("生产果汁作为产品");
    }
}
