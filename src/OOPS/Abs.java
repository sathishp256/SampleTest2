package OOPS;

interface BB {
	
	int a=10;
	int b=20;
	
	void m1();
	
	static void m2() {
		System.out.println("Static method");
	}
	
	default void m3() {
		System.out.println("default method");
	}
	
}

interface CC {
	
	void s1();
	
	static void s2() {
		System.out.println("Static method in child");
	}
}

class DD {
	void s4() {
		System.out.println("Class");
	}
}


public class Abs extends DD implements BB,CC {
	
	public void m1() {
		System.out.println("Abstract Method");
	}
	
	public void s1() {
		System.out.println("Abstract method from child");
	}

	public static void main(String[] args) {
		
	Abs a1=new Abs();
	CC b1=new Abs();
	
	CC.s2();
	b1.s1();
	
	a1.s4();
	a1.m1();
	a1.m3();
	BB.m2();
	a1.s1();
	CC.s2();
		
		
	}

}
