package Inheritance;

class AB {

	final String s1="Sathish";
	
    void m1() {
		System.out.println("Bhargav Sathish");
	}
}

class BC extends AB {
	String s1="PAWAN KALYAN";
	void m1() {
		System.out.println("Sathish");
		super.m1();
	}
}

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BC a1=new BC();
		//System.out.println(a1.a);
		
		//a1.a=200;
		
		a1.m1();
		
		//AB a3=new AB();
		//a3.m1(); 

	}

}
