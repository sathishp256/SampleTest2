package OOPS;


class AB {
	private int x;
	private int y;
	private int z;
	
	static String ofcloc="HYD-SEZ";
	
	
	
	void setx(int x) {
		this.x=x;
	}
	
	void getx() {
		System.out.println(x);
	}
}

public class Revision {
	
	int a;
	int b;
	int c;
	
	
	
	static	void setData(int a,int b,int c) {
	a=a;
	b=b;
    c=c;
		
		System.out.println(a +""+ b +""+ c);
	}
	
	void m1() {
		System.out.println("method1");
	}
	
	void m1(int a,int b) {
		
		System.out.println("Method2");
	}
	void m1(double a,int b) {
		System.out.println("Method3");
	}
	void m1(int b,double a) {
		
		System.out.println("Method2");
		
	}
	
	

	
	public static void main(String[] args) {
	
		//method overloading
		
		Revision r1=new Revision();
		
		r1.m1();
		r1.m1(1,2);
		r1.m1(1.2323,3);
		r1.m1(1,7.73763);
		
		
		
		System.out.println(r1.a);
		
		Revision.setData(1, 3, 5);

		AB aa=new AB();
		
		aa.setx(10);
		
		aa.getx();
		
		
		

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

}
