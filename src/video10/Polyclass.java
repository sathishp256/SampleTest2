package video10;

public class Polyclass {

	int a=10,b=20;
	
	
	void sum()  //1
	{
		System.out.println(a+b);
	}
	
	void sum(int x, int y) //2
	{
		System.out.println(x+y);
	}
	
	void sum(int x, double y) //3
	{
		System.out.println(x+y);
	}
	
	void sum(double y, int x) //3
	{
		System.out.println(x+y);
	}
	
	void sum(int a,int b, int c) 
	{
		
		System.out.println(a+b+c);
	}
	
	Polyclass(){
		System.out.println("HELLO");
	}

}
