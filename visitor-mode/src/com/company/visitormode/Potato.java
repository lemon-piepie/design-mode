package com.company.visitormode;

//具体元素：土豆
public class Potato implements Ingredients{
    @Override
    public String accept(Restaurant restaurant) {
        return restaurant.cook(this);
    }
}
