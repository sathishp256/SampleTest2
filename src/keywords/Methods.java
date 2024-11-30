package keywords;


class RRR {
	
//no params - no return value
	
	void m1() {
		System.out.println("No Params - No Return value");
	}
	
//no params - returns value
	
	String m2() {
		return "No params-Returns Value";
		
	}
//takes params no return value
	
	void m3(int a,int b)
	{
		System.out.println("takes params-noreturns value");
	}
	
//takes params - returns value
	
	String m4(int c,int d) {
		return "takes params-returns value";
	}
	
}
public class Methods {

	public static void main(String[] args) {
		
		RRR r1=new RRR();
		
		r1.m1();
		System.out.println(r1.m2());
		r1.m3(1,2);
		System.out.println(r1.m4(2,2));

	}

}
