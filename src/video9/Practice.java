package video9;

public class Practice {
	int eid;
	String ename;
	int sal;
	
	//no params - no return value
	
	void m1() {
	System.out.println("NO PARAMS - NO RETURNS VALUES");
	}
	
	//no params - retruns values
	
	String m2() {
		return "Satheesh";
	}
	
	//takes params - no return value
	
	void m3(int a,int b) {
		System.out.println(a+b);
	}
	
	//takes params - returns values
	
	String m4(String name) {
		return "OK";
	}
	/*void Setvalues(int id,String name,int sala) {
		eid=id;
		ename=name;
		sal=sala;
	}*/
	Practice(){
		eid=11223;
		ename="Sai";
		sal=1122334;
	}
	Practice(int id,String name,int sala)
	{
		eid=id;
		ename=name;
		sal=sala;
	}
		
	
	void display()
	{
		System.out.println(eid+" "+ename+" "+sal);
	}

	public static void main(String[] args) {
		
	Practice p1=new Practice(11827,"TOM",1726626);
	/*p1.eid=173478;
	p1.ename="Sathish";
	p1.sal=11223344;
	p1.display();*/
	//p1.Setvalues(1173478,"Satheesh", 233424415);
	p1.display();
		
	p1.m1();
	String s1=p1.m2();
	System.out.println(s1);
	p1.m3(10, 20);
	String s2=p1.m4("Check");
	System.out.println(s2);

	}

}
