package com.company.factorymode.abstractfactory;

public class Cola implements DrinkProduct{

    @Override
    public void createDrink() {
        System.out.println("生产可乐作为产品");
    }
}
