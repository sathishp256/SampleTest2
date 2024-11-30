package OOPS;

class Parent {
	int a=1001;
	void m1() {
		System.out.println("Parent class method");
	}
}

class child1 extends Parent {
	
	void m2() {
		System.out.println("Child1 class method");
	}
}

class child2 extends Parent {
	void m3() {
		System.out.println("Child2 class method");
	}
}


public class Hira  {

	
	public static void main(String[] args) {
		

		child2 ch1=new child2();
		child1 ch2=new child1();
		
		ch1.m1();
		
		ch1.m3();
		
		ch2.m1();
		ch2.m2();
		
		
		
		
	}

}
