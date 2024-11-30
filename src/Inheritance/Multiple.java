package Inheritance;

class Parent1 {
	void display(int a) {
		System.out.println(a);
	}
}
class Parent2 {
	void show(int b) {
		System.out.println(b);
	}
}

class Childd extends Parent1 {
	
	void print(int c) {
		System.out.println(c);
	}
}





public class Multiple {

	public static void main(String[] args) {
		
		Childd c1=new Childd();
		c1.display(400);
		c1.print(3);
		

	}

}
