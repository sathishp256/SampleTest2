package OOPS;

class RBI {
	double rate() {
		return 10.5;
	}
	
	double rate(String bank) {
		return 10.9;
	}
	
	double rate(String bank,int code) {
		return 11.5;
	}
}

class icici extends RBI {
	
	double rate() {
		return 11.5;
	}
}

class sbi extends RBI {
	
	double rate() {
		return 12.5;
	}
}

public class MethodOver {

	public static void main(String[] args) {
		
		
		icici ic=new icici();
		System.out.println(ic.rate());
		
		System.out.println(ic.rate("IC"));
		
		System.out.println(ic.rate(null, 0));
		
		sbi sb=new sbi();
		System.out.println(sb.rate());
		
		
	
	
	}

}
