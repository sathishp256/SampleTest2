package InterfaceDemo;

class ccc{
	void m3() {
		System.out.println("class");
	}
}

public class Sample1Imple extends ccc implements SampleInter,Sample1Inter  {

	public void m1() {
		System.out.println("p1: abstract methods"+x);
	}
	
	public void m2() {
		
		System.out.println("p2: abstract methods"+y);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample1Imple sp1=new Sample1Imple();
		
		sp1.m1();
		sp1.m2();
		sp1.m3();

	}

}
