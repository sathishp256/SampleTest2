package OOPS;


class AParent {
	
	 int a=10;
	void m1() {
		System.out.println("Parent Method");
	}
	
	void m2() {
		System.out.println("Bhargav Sathish");
	}
	
}

class BChild extends AParent {
	int a=20;
	void display() {
		System.out.println(super.a);
	}
	
	void m3() {
		super.m2();
	}
}



public class Inherit {

	public static void main(String[] args) {
		
		// 4 types of inheritance
		
		//single - one parent &one child
		//multilevel - one parent - one child , parent -child
		//hirarchy - one parent - multiple childs
		//multiple inheritance - multiple parents - one child
		
		BChild b1=new BChild();
		
		//b1.m1();
		b1.m3();
		//System.out.println(b1.a);
		//System.out.println(b1.b);
		
	}

}
