package com.company.commandmode;

public class Main {

    public static void main(String[] args) {
	    Command soup = new CookSoupCommand();
	    Command meat = new CookMeatCommand();
	    Command vegetable = new CookVegetableCommand();

	    Customer customer = new Customer();
	    customer.Meat(meat);
	    customer.Soup(soup);
	    customer.Vegetable(vegetable);

	    customer.CookSoup();
	    customer.CookMeat();
	    customer.CookVegetable();
    }
}
