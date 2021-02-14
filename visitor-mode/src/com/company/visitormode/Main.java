package com.company.visitormode;

public class Main {

    public static void main(String[] args) {
	    SetIngredients setIngredients = new SetIngredients();
	    setIngredients.add(new Potato());
	    setIngredients.add(new Vegetable());
	    Restaurant restaurant = new ChineseRestaurant();
	    System.out.println(setIngredients.accept(restaurant));

	    System.out.println("**********************");
	    Restaurant westernRestaurant = new WesternRestaurant();
	    System.out.println(setIngredients.accept(westernRestaurant));
    }
}
