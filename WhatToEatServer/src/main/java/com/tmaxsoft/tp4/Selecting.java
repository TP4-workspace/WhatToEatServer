package com.tmaxsoft.tp4;

public class Selecting {    

	private final String food;
	String[] foodArray = { "gyo_jjam", "sun_dai", "real_china" };

	public Selecting(int rand) {		
		this.food = foodArray[rand%foodArray.length];
	}

	public String getFood() {
		return food;
	}
}
