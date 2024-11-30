package OOPS;

import java.util.Arrays;

public class Stringgg {

	public static void main(String[] args) {
		
		String s1="RRR";
		
		String s2=new String("AAA");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s2.length());
		
		System.out.println(s1+s2);
		
		System.out.println(s1.concat(s2));
		
		System.out.println(s1.concat(s2).concat(s1));
		
		String s3="  Sathish  ";
		
		System.out.println(s3.trim());
		
		System.out.println(s3.charAt(6));
		
		System.out.println(s3.contains("Sat"));
		
		//System.out.println();

		String s4="rrr";
		
		System.out.println(s1.equalsIgnoreCase(s4));
		
		System.out.println(s4.replace("rrr","ppp"));
		
		System.out.println(s4.substring(0,2));
		
		System.out.println(s4.toLowerCase());
		
		System.out.println(s4.toUpperCase());
		
		String s5="abc@gmail.com";
		
		String tt[]=s5.split("@");
		
		System.out.println(Arrays.toString(tt));
		
		int i=10;
		while(i<=100)
		{
			System.out.println(i);
			i++;
		}
		
		int y=20;
		do 
		{
			System.out.println(y);
			y++;
		}
		while(y<=50);
		
		for(int g=0;g<=40;g++) {
			System.out.println(g);
		}
		
		
		
	}

}
