package OOPS;


class AAA 
{
	void m1() {
		System.out.println("Method overloading-1");
	}
	
	void m1(int a,int b)  {
		System.out.println("Method Overloading -2" + (a+b));
	}
	
	void m1(float d,int c)  {
		System.out.println("Method Overloading -3"+ (d+c));
	}
	void m1(int c,float d) {
		System.out.println("Method Overloading -4"+ (d+c));
	}
		

    AAA() {
    	System.out.println("Default Constructor");
    }
    
    AAA(int a) {
    	System.out.println(a);
    }
    AAA(int a,int b) {
    	System.out.println(a+b);
    }
    AAA(int a,float b) {
    	System.out.println(a+b);
    }
    AAA(float b,int a) {
    	System.out.println(a+b);
    }
    
}
    

public class Poly {
	
	
	public static void main(String[] args) {
		
		//Polymorphism
		
		//poly-many & morhpism - forms
		
		//one thing can have many forms
		
		AAA f1=new AAA(2.5f,1);
		
		/*f1.m1();
		f1.m1(1, 2);
		f1.m1(13.3f, 5);
		f1.m1(2, 3.5f);*/
		
		
		
		

	}

}
