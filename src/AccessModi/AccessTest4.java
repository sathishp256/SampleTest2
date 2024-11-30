package AccessModi;

public class AccessTest4 {
	
	public static int a=100;
	private static int b=200;
	
	int c=400;
	
	protected int p2=500;
	

	public void sample() {
		System.out.println("Default");
	}
	
	
	protected void sample1() {
		System.out.println("");
	}
	

	public static void main(String[] args) {
		
		//private modifier
		
		System.out.println(a);
		
	}

}
