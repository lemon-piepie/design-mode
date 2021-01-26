package com.company.commandmode;

//调用者
public class Customer {
    private Command meat, soup, vegetable;

    public void Meat(Command command) {
        meat = command;
    }

    public void Soup(Command command) {
        soup = command;
    }

    public void Vegetable(Command command) {
        vegetable = command;
    }

    public void CookMeat() {
        meat.execute();
    }

    public void CookSoup() {
        soup.execute();
    }

    public void CookVegetable() {
        vegetable.execute();
    }

}
