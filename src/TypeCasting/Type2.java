package TypeCasting;

import java.util.*;

class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}

public class Type2 {

	public static void main(String[] args) {
		
		//Dog d=new Animal();  // not possible downcating directly
		
		//downcasting process
		
		//Animal a=new Animal();
		
		//Dog d1=(Dog)a;
		
		//Cat c1=(Cat)a;
		
		//Dog d3=new Dog();
		
		//Cat c2=(Cat)d3; /// not possible as there is no realtion between dog and cat
		
		//upcasting 
		
		Animal a2=new Animal();
		
		Dog d1=new Dog();
		
		//upcasting
		//Animal a1=d1;
		
		//downcasting
		
		//Cat c2=(Cat)a2;
		
		
		
		
		
		
		
		
		
	}

}
