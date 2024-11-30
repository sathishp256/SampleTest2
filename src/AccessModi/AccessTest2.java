package AccessModi;
import AccessModi.AccessTest1;
import AccessModi.AccessTest4;
import AccessModi2.AccessTest3;


public class AccessTest2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessTest3 t3=new AccessTest3();
 		
		System.out.println(t3.a);

		t3.q1();
		
		AccessTest4 t4=new AccessTest4();
		
		System.out.println(t4.a);
		
		t4.sample();
		
		System.out.println(t4.p2);
		
		
	}

}
