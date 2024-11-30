package video7;

public class Rverse {

	public static void main(String[] args) {


		String s="TCS";
		
		String s1="";
		
		//for(int i=s.length()-1;i>=0;i--)
		//{
			//s1=s1+s.charAt(i);
		//}
		
		//System.out.println(s1);
		
		String s2="WELCOME";
		
		String rev="";
		
		char ac[]=s2.toCharArray();
		
		for(int i=ac.length-1;i>=0;i--)
		{
			rev=rev+ac[i];
			
		}
		
		System.out.println(rev);
		
		StringBuffer std=new StringBuffer("INFOSYS");
		
		System.out.println(std.reverse());
		

		StringBuilder stc=new StringBuilder("EDGEVERVE");
		
		System.out.println(stc.reverse());
		
		//immutable
		
		String c1="welcome";
		
		c1.concat("HELLO");
		
		System.out.println(c1);
		
		// mutable string buffer
		
		StringBuffer sb1=new StringBuffer("HELLO");
		
		sb1.append("HII");
		
		
		System.out.println(sb1);
		
	// mutable string builder
		
		StringBuilder sb2=new StringBuilder("GOOD");
		
		sb1.append("MORNING");
		
		
		System.out.println(sb2);
		
		
		//euqals and ==
		
		String s11=new String("HI");
		
		String s12=new String("HI");
		
		System.out.println(s11==s12);
		
		System.out.println(s11.equals(s12));
		
		
		
		

	}

}
