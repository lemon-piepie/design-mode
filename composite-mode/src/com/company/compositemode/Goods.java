package com.company.compositemode;

import java.math.BigDecimal;
import java.math.RoundingMode;

//树叶构件：商品
public class Goods implements Articles {
    private String name;
    private int quantity;
    private BigDecimal unitPrice;

    public Goods(String name, int quantity, BigDecimal unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public BigDecimal calculation() {
        return unitPrice.multiply(BigDecimal.valueOf(quantity)).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public void pack() {
        System.out.println("购买了" + name + quantity + "件，单价：" + unitPrice + "元");
    }
}
