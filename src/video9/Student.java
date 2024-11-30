package video9;

public class Student {

	int sid;
	String sname;
	int age;
	
//no parms no return
	
	void m1()
	{
		System.out.println("Hello");
	}

	// no params and returns value
	
	String m2()
	{
	
		return "hi return";
	}
	
	// takes params - no return value
	
	void m3(String name) {
		System.out.println(name);
	}
	
	//takes params and returns values
	
	String m4(String name) {
		return name;
	}
	
	// approch 2 using method stroing values in variables
	/*void m5(int id,String name,int ag)
	{
		sid=id;
		sname=name;
		age=ag;
		
		System.out.println(sid +" "+sname+" "+age);
	}*/
	
	//constructor
	
	Student(int id,String name,int agee) 
	{
		sid=id;
		sname=name;
		age=agee;
		
	}
	
	Student(){
		sid=100;
		sname="defaultname";
		age=12;
	}
	
	void m6() {
		System.out.println(sid +" "+sname+" "+age);
	}
}
