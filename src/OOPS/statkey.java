package OOPS;


class PPP {
	static String dep="CSE";
	static String Clg="SCET";
	
	static void m1() {
		System.out.println("Static method");
	}
}

public class statkey {
	//static String dep="CSE";
	//static String Clg="SCET";

	public static void main(String[] args) {
		//static keyword
		
		//common data &without object creation
	
		PPP p1=new PPP();
		p1.dep="IT";
		
		
		PPP.m1();
		
		
		
		

	}

}
