package OOPS;

abstract class JK {
	abstract void m7();
	void m8() {
		System.out.println("Non abstract method");
	}
}


public class abstrac extends JK {
	
	void m7() {
		System.out.println("Abstract method");
	}

	public static void main(String[] args) {
	
		JK j1=new abstrac();
		
		j1.m7();
		j1.m8();
		
		
		long ll=123434334L;
		
		
		int id=10,ik=90;
		
		int a;
		
		 a=70;
		 
		 int b=50;
		
		

	}

}
