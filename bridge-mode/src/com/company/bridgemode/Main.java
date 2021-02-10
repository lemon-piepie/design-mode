package com.company.bridgemode;

public class Main {

    public static void main(String[] args) {
	    Color color = new Black();
	    GamePlayer gamePlayer = new PS();
	    gamePlayer.setColor(color);
	    System.out.println(gamePlayer.play());
    }
}
