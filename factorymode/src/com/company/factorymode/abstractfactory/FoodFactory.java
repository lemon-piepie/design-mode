package com.company.factorymode.abstractfactory;

public interface FoodFactory {
    public DrinkProduct newDrinkProduct();
    public SnackProduct newSnackProduct();
}
