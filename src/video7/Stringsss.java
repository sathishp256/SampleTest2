package video7;

public class Stringsss {

	public static void main(String[] args) {
		
		String s="WELCOME";
		//length
		
		System.out.println(s.length());
		System.out.println("WEL".length());
		
		String s1="WELCOME";
		
		String s2="TO JAVA";
		//concat
		//System.out.println(s+s2);
		
		// System.out.println(s1.concat(s2));
		
		
		String s3="PROGRAM";
		
		System.out.println(s1.concat(s2).concat(s3));
		
		System.out.println("WELCOME"+"JAVA");
		
		System.out.println("WELCOME TO JAVA".concat("Programming"));
		
		//trim
		
		String c="   Sathish   ";
		
		System.out.println(c.length());
		
		System.out.println(c.trim());
		
		System.out.println(c.charAt(3));
		
		
		//contains
		
		System.out.println(c.contains("Sathish"));
		
		//equals and equalignore case
		
		String c1="HI";
		String c2="hi";
		
		System.out.println(c1.equalsIgnoreCase(c2));
		
		//replace
		
		String d1="WELCOME SELENIUM PROJECT SELENIUM ELEMENT";
		
		//System.out.println(d1.replace('E','A '));
		
		System.out.println(d1.replace("SELENIUM","PYTHON"));
		
		//substring
		
		System.out.println(d1.substring(0,6));
		
		System.out.println(d1.substring(0,3));
		
		//to upper case or to lower case
		
		System.out.println(d1.toLowerCase());
		
		System.out.println(c.toUpperCase());
		
		//split
		
		String f1="ABC@GMAIL.COM";
		
		String f2[]=f1.split("@");
		
		System.out.println(f2[0]);
		System.out.println(f2[1]);
		
	}

}
