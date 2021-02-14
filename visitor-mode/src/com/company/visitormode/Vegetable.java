package com.company.visitormode;

//具体元素：蔬菜
public class Vegetable implements Ingredients {
    @Override
    public String accept(Restaurant restaurant) {
        return restaurant.cook(this);
    }
}
