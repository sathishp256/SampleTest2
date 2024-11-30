package video9;

public class Studentmain {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"TEJU",21);
		
		s1.m1();
		
		String c1=s1.m2();
		
		System.out.println(c1);
		
		System.out.println(s1.m2()); 
		
		s1.m3("Sathish");
		
		String c2=s1.m4("PAWAN KALYAN");
		
		System.out.println(c2);
		
		//s1.m5(1,"sai", 16);
		
	s1.m6();
	

	}

}
