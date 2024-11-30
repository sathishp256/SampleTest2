package InterfaceDemo;

interface Sparent {
	void l1();
}
interface PParent {
	void l2();
}

abstract class jk {
	abstract void l3();
}


interface sathish {
	int a=10;  // be default static and final variables
	int b=20;


void h1();

}

interface Ravi {
	
	default void h2(int a) {
		System.out.println(a);
	}
	
	static void h3(int b) {
		System.out.println(b);
	}
}




public class InterfaceSample extends jk implements Sparent,PParent {

	//public void h1() {
		//System.out.println("Abstract method");}
	
	public void l1() {
		System.out.println("Parent1");
	}
	public void l2() {
		System.out.println("Parent2");
	}
	public void l3() {
		System.out.println("Abstract class");
	}
	
	public static void main(String[] args) {

		InterfaceSample is1=new InterfaceSample();
		
		//is1.a=500;  not possible
		
		//is1.h1();
		//is1.h2(4);
		//Ravi.h3(5);
		
		//Ravi is2=new InterfaceSample();
		
		//is2.h2(3);
		//Ravi.h3(04);
		
		is1.l1();
		is1.l2();
		is1.l3();
	

	}

}
