package edu.jalc.inclass.labs.animal;

public class Cat extends Animal {

	String meow;
	String purr;

	private Cat(Animal animal){
		super(null);
	}

	public Cat(String meow, String purr, String growl){
		super(growl);
		this.purr = purr;
		this.meow = meow;
	}

}