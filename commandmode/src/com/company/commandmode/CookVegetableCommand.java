package com.company.commandmode;

public class CookVegetableCommand implements Command {
    private final Chief chief = new Chief();

    @Override
    public void execute() {
        chief.Cook();
        System.out.println("正在制作蔬菜菜品");
    }
}
