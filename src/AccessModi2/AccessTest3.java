package AccessModi2;

import AccessModi.AccessTest4;

public class AccessTest3 extends AccessTest4 {

	  public int a=10;
	  public int b=29;
		
	 public void q1() {
		System.out.println("HELLO");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(AccessTest4.a);
		
		
		//AccessTest at4=new AccessTest4();
		
		
		AccessTest3 at3=new AccessTest3();
		
		//at4.sample();
		//stem.out.println(at4.c);
		
		at3.sample();
		
		at3.sample1();
		
		
		

	}

}
