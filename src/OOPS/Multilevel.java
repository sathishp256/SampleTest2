package OOPS;

class A {
	
	void m1() {
		System.out.println("A class method");
	}
	
}

class B extends A {
	
	void m2() {
		System.out.println("B class method");
	}
	
}

class C extends B {
	
	void m3() {
	System.out.println("C class Method");
	}
}



public class Multilevel {

	public static void main(String[] args) {
		
		C c1=new C();
		
		c1.m1();
		c1.m2();
		c1.m3();

		
	}

}
