package com.company.mdecoratorode;

public class Main {

    public static void main(String[] args) {
	    HomeDishes regular = new RegularMethod();
	    regular.tomatoEgg();
	    regular.redMeat();

	    System.out.println("**********************");
	    HomeDishes differentTomatoEgg = new DifferentTomatoEgg(regular);
	    differentTomatoEgg.tomatoEgg();
	    System.out.println("---------------");
	    HomeDishes differentRedMeat = new DifferentRedMeat(regular);
	    differentRedMeat.redMeat();
    }
}
