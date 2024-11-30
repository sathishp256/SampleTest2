package Sample1Package;

public class Wrapper {

	public static void main(String[] args) {
		
		String s1="100";
		String s2="100";
		
		System.out.println(s1+s2);
		
		int d=Integer.parseInt(s1);
		int f=Integer.parseInt(s2);
		
		System.out.println(d+f);
		
		// 2
		
		String s3="12.56";
		String s4="12.56";
		
		
		System.out.println(s3+s4);
		
		double g=Double.parseDouble(s3);
		double n=Double.parseDouble(s4);
		
		System.out.println(g+n);
		
		String h1="false";
		String h2="true";
		
		System.out.println(h1+h2);
		
		System.out.println(Boolean.parseBoolean(h1));
		System.out.println(Boolean.parseBoolean(h2));
		
		// primitie to string. int,boolean,double->String
		
		int ii=10;
		double dd=20.5;
		boolean bb=true;
		char cc='A';
		
		System.out.println(String.valueOf(ii));
		System.out.println(String.valueOf(dd));
		System.out.println(String.valueOf(bb));
		System.out.println(String.valueOf(cc));
		
		
		
		
		
		

	}

}
