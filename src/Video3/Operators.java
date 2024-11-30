package Video3;

public class Operators {

	public static void main(String[] args) {
	
		//Arthimetic Opearators
		
		int a=10;
		int b=20;
		
		int result=a+b;
		
		System.out.println("sum of a and b "+ result);
		System.out.println("sub of a and b "+ (b-a));
		System.out.println("mul of a and b "+ (a*b));
		System.out.println("div of a and b "+ (b/a));
		System.out.println("modulo of a and b "+ (b%a));
		
		//comparision operators
		
		System.out.println(b<a);
		System.out.println(b>a);
		System.out.println(a<=b);
		System.out.println(a>=b);
		a=20;
		System.out.println(a==b);
		System.out.println(b!=a);
		
		boolean res=(a==b);
		System.out.println(res);
		
	//logical operators
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
		boolean x1=10<20;
		System.out.println(x1);
		
		boolean x2=10>200;
		System.out.println(x2);
		
		boolean ress=(x1&&x2);
		
		System.out.println(ress);
		
		System.out.println(x1||x2);
		
		System.out.println((10<20)&&(100>20));
		
	}

}
