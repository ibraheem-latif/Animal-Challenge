package com.qa.animalchallenge;

public class Animal implements home, sleeps {
	
	private boolean vegetarain;
	
	private String eat;
	
	private int legs;
	
	public Animal() {}
	
	public Animal (Boolean veg, String eat, int legs) {
		this.vegetarain = veg;
		this.eat = eat;
		this.legs = legs;
		
		
	}

	public boolean getVegetarain() {
		return vegetarain;
	}

	public void setVegetarain(boolean vegetarain) {
		this.vegetarain = vegetarain;
	}

	public String getEat() {
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	@Override
	public void suburbs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
	
	


}
