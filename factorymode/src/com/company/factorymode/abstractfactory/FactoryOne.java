package com.company.factorymode.abstractfactory;

public class FactoryOne implements FoodFactory{
    @Override
    public DrinkProduct newDrinkProduct() {
        System.out.println("由第一个工厂生产饮料产品");
        return new Cola();
    }

    @Override
    public SnackProduct newSnackProduct() {
        System.out.println("由第一个工厂生产零食产品");
        return new Cookie();
    }
}
