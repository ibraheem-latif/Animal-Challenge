package com.qa.animalchallenge;

public class turtle extends Animal{
	
private boolean swim = true;
	
	public void turtleThing() {
		System.out.println("what eat?: "+super.getEat());
		
	}
	public void canSwim() {
		System.out.println("Can it swim? " + swim);
	}
	
	@Override
	public void suburbs() {
		// TODO Auto-generated method stub
		System.out.println("I dont stay in the suburbs");
	}
	@Override
	public void sea() {
		// TODO Auto-generated method stub
		System.out.println("I stay in the sea");
	}
	@Override
	public void sleep() {
		System.out.println("Zzzzzz");
	}


}
