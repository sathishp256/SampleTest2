package video10_2;

public class Sample {
	
	/*//Polymorphism
	poly means many
	morphism means forms
	one thing can be many forms
	we can acheive polymorphism through method overloading
	we can create multiple methods with same name and different parameters lists
	if two or more methods having same name and different parameter lsits then its called method overloading
	overloading is applicable for methods and constructors*/
	
	int a=10,b=20;
			
	void test() {
		System.out.println(a+b);
	}
	void test(int x,int y) {
		System.out.println(x+y);
	}
	void test(int x,double y) {
		System.out.println(x+y);
	}
	void test(double x,int y) {
		System.out.println(x+y);
	}
	
	Sample(){
		System.out.println("Default Constructor");
	}
	Sample(int x) {
		System.out.println(x);
	}
	Sample(int x,int y){
		System.out.println(x+y);
	}
	Sample(int x,int y,int z){
		System.out.println(x+y+z);
	}
}
