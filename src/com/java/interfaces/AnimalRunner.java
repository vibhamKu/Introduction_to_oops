package com.java.interfaces;


abstract class Animal {
	abstract public void bark();
}


class Dog extends Animal{

public void bark() {
	// TODO Auto-generated method stub
	System.out.println("Bow Bow");
}
}


class Cat extends Animal{

public void bark() {
	// TODO Auto-generated method stub
	System.out.println("Meow Meow");
}
}

public class AnimalRunner {  


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animals = {new Cat(), new Dog()};
		for(Animal object : animals)
		object.bark();

	}
}
