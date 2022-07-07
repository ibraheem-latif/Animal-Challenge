package com.qa.animalchallenge;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal tom = new Cat();
		((Cat) tom).doThing();
		((Cat)tom).col();
		((Animal)tom).getLegs();
		
		Animal jerry = new Dog();
		((Dog)jerry).dri();
		
		Animal george = new Parrot();
		((Parrot)george).hasFeathers();
		
		Animal nigel = new turtle();
		((turtle)nigel).sea();
		
		
	

	}

}
