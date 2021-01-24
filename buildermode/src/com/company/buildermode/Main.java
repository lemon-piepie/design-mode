package com.company.buildermode;

public class Main {

    public static void main(String[] args) {
        Player player = new Player(new FemaleBuilder());
        player.getResult();
    }
}
