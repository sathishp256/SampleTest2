package Wrapperdemo;

public class WrapperDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		String s1="true";
		
		//int i=Integer.parseInt(s1);
		
		//double d=Double.parseDouble(s1);
		
		//boolean b=Boolean.parseBoolean(s1);
		
		//System.out.println(b);
		
		String s2="100";
		String s3="100";
		
		System.out.println(Integer.parseInt(s2)+Integer.parseInt(s3));
		System.out.println(Double.parseDouble(s2)+Double.parseDouble(s3));
		System.out.println(Boolean.parseBoolean(s2));
		
		int x=2000;
		
		int y=200;
		
		String s5=String.valueOf(x);
		
		System.out.println(String.valueOf(x)+String.valueOf(y));

		boolean b2=true;
		System.out.println(String.valueOf(b2));
		
		double dd=10.5;
		String s6=String.valueOf(dd);
		System.out.println(s6);
		
		char c='A';
		
		String s7=String.valueOf(c);
		
		System.out.println(s7);
		
		Thread.sleep(1000);
		
	}

}
