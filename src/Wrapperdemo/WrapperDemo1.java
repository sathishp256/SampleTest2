package Wrapperdemo;
import AccessModi.*;


//int - Integer, double-Double, boolean-Boolean,Char-Character

 


public class WrapperDemo1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="100";
		String s2="200";
		
		//System.out.println(s1+s2);
		
		//System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		
		
		// decimal 
		String s3="100.00";
		String s4="200.00";
		
		System.out.println(s3+s4);
		
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));
		
		// boolean
		
		String s5="true";
		
		System.out.println(Boolean.parseBoolean(s5));
		
		// int to string
		
	
		int s6=100;
		
		System.out.println(String.valueOf(s6));
		
		double d=10.3;
		
		System.out.println(String.valueOf(d));
		
		boolean b1=true;
		
		System.out.println(String.valueOf(b1));
		
		char ch='A';
		System.out.println(String.valueOf(ch));
	}

}
