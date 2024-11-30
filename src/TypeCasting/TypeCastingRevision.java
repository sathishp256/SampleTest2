package TypeCasting;

public class TypeCastingRevision {

	public static void main(String[] args) {
		
		//type casting
		
		//we can convert the data from one type to another type is called type casting
		
		//types of casting
		
		//upcasting - converting the data from lower to higher or smaller to larger, no need to specofy explicitly
		//downcasting - converting the data from higher to lower or larger to smaller, we need to specify explictly
		
		//upcasting
		
		byte b1=100;
		
		long l1=b1;
		System.out.println(l1);
		
		short s1=12;
		double d1=s1;
		System.out.println(d1);
		
		//downcasting
		
		double d2=10.54;
		
		byte b2=(byte)d2;
		System.out.println(b2);
		
		int i3=1;
		
		char c1=(char)i3;
		System.out.println(c1);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
