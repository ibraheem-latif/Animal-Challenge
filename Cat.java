package com.qa.animalchallenge;

public class Cat extends Animal  {
	
	private String colour = "black and white";
	
	public void doThing() {
		System.out.println("Is Vegy?: "+super.getVegetarain());
		
	}
	public void col() {
		System.out.println(colour);
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
