package OOPS;

class ABC {
	
	int id;
	String name;
	int age;
	String dept;
	
	ABC() {
		System.out.println("Default Constructor");
	}
	
	ABC(int id,String name,int age,String dept) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.dept=dept;
		
	}
	
	
	void display() {
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(dept);
		
		
	}
}


public class CllassRevision {

	public static void main(String[] args) {
		
		//class
		//class is nothing but a blue print or plan
		//class is  a collection of attributes and behaviour
		//class is a collection of varibales and methods
		//class is logical or virtual entity which doesn't occupy any space in memory
		
		
		//object
		
		 ABC ab=new ABC(105,"Sathish",25,"CS");
		 
		/* ab.id=101;
		 ab.name="Sathish";
		 ab.age=25;
		 ab.dept="CSE"; */
		 
		 //ab.setdata(102, "Bhargav",24, "ECE");
		 
		 ab.display();
		 
		 //System.out.println(ab.name);
		
		
		
	}

}
