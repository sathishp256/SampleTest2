package keywords;

public class Staticcc {
	
	static int a=10;
	
	int b=20;
	
	static void m1() {
		System.out.println("Static method");
	}

	void m2() {
		System.out.println("non static method");
	}
	public static void main(String[] args) {
	
		//a=30;
		System.out.println(a);
		m1();
		
		//System.out.println(b); // cannot access non static variable directly
		//m2(); // cannot access non static method directly
		
		Staticcc sc=new Staticcc();
		
		System.out.println(sc.b);
		sc.m2();
	}

}
