package com.company.factorymode;

import com.company.factorymode.factory.ClothesFactory;
import com.company.factorymode.factory.ClothesProduct;
import com.company.factorymode.factory.JacketFactory;
import com.company.factorymode.factory.TShirtFactory;

public class Main {

    public static void main(String[] args) throws Exception {
        createTShirt();
        createJacket();
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
}
