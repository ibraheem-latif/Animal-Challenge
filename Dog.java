package com.qa.animalchallenge;

public class Dog extends Animal {
	
	private String drinks = "water";
	
	public void dogThing() {
		System.out.println("How many legs?: "+super.getLegs());
		
	}
	public void dri() {
		System.out.println("I drink "+drinks);
	}
	
	@Override
	public void suburbs() {
		// TODO Auto-generated method stub
		System.out.println("I stay in the suburbs");
	}
	@Override
	public void sea() {
		// TODO Auto-generated method stub
		System.out.println("I dont stay in the sea");
	}
	@Override
	public void sleep() {
		System.out.println("Zzzzzz");
	}

	
	

}
