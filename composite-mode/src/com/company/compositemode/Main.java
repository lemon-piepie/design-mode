package com.company.compositemode;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BigDecimal sum = BigDecimal.ZERO;
        Package BigBag, mediumBag, smallRedBag, smallWhiteBag;
        Goods goods;
        BigBag = new Package("大袋子");
        mediumBag = new Package("中袋子");
        smallRedBag = new Package("红色小袋子");
        smallWhiteBag = new Package("白色小袋子");

        goods = new Goods("沙拉酱", 2, new BigDecimal("7.9"));
        smallRedBag.add(goods);
        goods = new Goods("饼干", 1, new BigDecimal("9.9"));
        smallRedBag.add(goods);
        goods = new Goods("特仑苏牛奶", 2, new BigDecimal("68"));
        smallWhiteBag.add(goods);
        goods = new Goods("红茶", 3, new BigDecimal("180"));
        smallWhiteBag.add(goods);

        goods = new Goods("年货套装", 1, new BigDecimal("380"));
        mediumBag.add(goods);
        mediumBag.add(smallRedBag);

        goods = new Goods("电饭锅", 1, new BigDecimal("198"));
        BigBag.add(goods);
        BigBag.add(smallWhiteBag);
        BigBag.add(mediumBag);

        System.out.println("您选购的商品有：");
        BigBag.pack();
        sum = BigBag.calculation();
        System.out.println("要支付的总价是：" + sum + "元");
    }
}
