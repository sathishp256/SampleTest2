package Inheritance;

class H {
	int a=10;
	void m1() {
	System.out.println("Parent class");
	}
}

class K extends H {
	
	int a=20;
	 void m1() {
	
		 super.m1();
	 }
	
}

public class Supeer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		K k2=new K();
		
		k2.m1();
	}
	

}
