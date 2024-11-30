package Inheritance;

class Parent {
	
	void display(int x) {
		System.out.println(x);
	}
}

class Child1 extends Parent {
	
	void show(int b) {
		System.out.println(b);
	}
	
}

class Child2 extends Parent {
	
	void print(int c) {
		System.out.println(c);
	}
}


public class Hirarchy {

	public static void main(String[] args) {
		
		Child1 c1=new Child1();
		
		c1.display(500);
		c1.show(200);
		
		Child2 c2=new Child2();
		
		c2.display(5);
		c2.print(2);
		
		
	}

}
