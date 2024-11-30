package video7;

public class StringPractice {

	public static void main(String[] args) {
		
		String s1="HELLO";
		//System.out.println(s1.length());
		System.out.println("RRR".length());
		
		String s2="HII";
		String s3="NAMASTE";
		
		
		//System.out.println(s1.concat(s2).concat(s3));
		
		String s4="   HELLO   ";
		
		System.out.println(s4.trim());
		System.out.println(s3.charAt(3));
		
		//System.out.println(s3.contains("NM"));
		
		System.out.println(s3.equalsIgnoreCase("NAMASTe"));
		
		System.out.println(s3.replace("NAMASTE", "SALAMALEKUM"));
	
		
		System.out.println(s3.substring(0,3));
		
		System.out.println(s3.toUpperCase());
		
		String s5="bcd@gmail.com";
				
		String s7[]=s5.split("@");
		
		System.out.println(s7[1]);
	}

}
