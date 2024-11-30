package Inheritance;

class Bankk
{
	double roi() {
		return 0;
	}
}

class icici extends Bankk {
	
	double roi() {
		return 10.5;
	}
	
}

class sbi extends Bankk {
	
	double roi() {
		return 12.5;
	}
	
}

public class Bank {

	public static void main(String[] args) {
		
		Bankk b=new Bankk();
		System.out.println(b.roi());
		
		icici i=new icici();
		System.out.println(i.roi());
		
		sbi s=new sbi();
		System.out.println(s.roi());

	}

}
