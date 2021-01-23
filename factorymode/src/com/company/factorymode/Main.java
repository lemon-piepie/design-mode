package com.company.factorymode;

import com.company.factorymode.abstractfactory.*;
import com.company.factorymode.factory.ClothesFactory;
import com.company.factorymode.factory.ClothesProduct;
import com.company.factorymode.factory.JacketFactory;
import com.company.factorymode.factory.TShirtFactory;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("————————使用工厂方法模式————————");
        createTShirt();
        createJacket();
        System.out.println("————————使用抽象工厂模式————————");
        createColaAndCookie();
        createJuiceAndCookie();
    }

    private static void createJacket() {
        System.out.println("**********工厂方法生产夹克**********");
        ClothesFactory factory = new JacketFactory();
        ClothesProduct jacket = factory.newProduct();
        jacket.create();
    }

    private static void createTShirt() {
        System.out.println("**********工厂方法生产T恤**********");
        ClothesFactory factory = new TShirtFactory();
        ClothesProduct tShirt = factory.newProduct();
        tShirt.create();
    }

    private static void createColaAndCookie() {
        System.out.println("**********抽象工厂方法生产可乐/曲奇**********");
        FoodFactory factory = new FactoryOne();
        DrinkProduct drinkProduct = factory.newDrinkProduct();
        drinkProduct.createDrink();

        SnackProduct snackProduct = factory.newSnackProduct();
        snackProduct.createSnack();
    }

    private static void createJuiceAndCookie() {
        System.out.println("**********抽象工厂方法生产果汁/曲奇**********");
        FoodFactory factory = new FactoryTwo();
        DrinkProduct drinkProduct = factory.newDrinkProduct();
        drinkProduct.createDrink();

        SnackProduct snackProduct = factory.newSnackProduct();
        snackProduct.createSnack();
    }
}
