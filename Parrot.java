package com.qa.animalchallenge;

public class Parrot extends Animal {
	
	private boolean feathers = true;
	
	public void parrotThing() {
		System.out.println("what eat?: "+super.getEat());
		
	}
	public void hasFeathers() {
		System.out.println("Does it have feathers? " + feathers);
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
