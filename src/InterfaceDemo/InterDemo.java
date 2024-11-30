package InterfaceDemo;

interface Shape 
{
	int length=10;  // final and static var
	int width=20; // final and static var
	
	void circle();  // public methods
	
	default void square() {  // default methods
		System.out.println("default method");
	}
	
	static void rectangle() {
		System.out.println("static method");
	}
}



public class InterDemo implements Shape 
{
	
	public void circle()
	{
		System.out.println("implementation of abstract method");
	}

	
	int ab=20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterDemo id1obj=new InterDemo();
		
		id1obj.circle();
		
		id1obj.square();
		

		Shape.rectangle();
		
		Shape sh1=new InterDemo();   ///// 
		
		sh1.circle();
		sh1.square();
		
		Shape.rectangle();
		
		//System.out.println(sh1.ab);
		
		

	}

}
