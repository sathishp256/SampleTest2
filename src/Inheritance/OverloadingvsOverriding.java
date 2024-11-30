package Inheritance;

class E {
	void m1(int a) {
		System.out.println(a);
	}
	void m2(int b) {
		System.out.println(b);
	}
}
class F extends E {
	
	void m1(int a) {
		System.out.println(a*a);
	}
	
	void m2(int b, int c) {
		System.out.println(b+c);
	}
	
}




public class OverloadingvsOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		F ba1=new F();
		
		ba1.m2(2);

	}

}
