package com.company.factorymode.abstractfactory;

public class FactoryTwo implements FoodFactory{

    @Override
    public DrinkProduct newDrinkProduct() {
        System.out.println("由第二个工厂生产饮料产品");
        return new Juice();
    }

    @Override
    public SnackProduct newSnackProduct() {
        System.out.println("由第二个工厂生产零食产品");
        return new Cookie();
    }
}
