package Inheritance;

class A {
	int a=10;
	void display() {
		System.out.println(a);
	}
}

class B extends A {
	int b=20;
	void show() {
		System.out.println("A value"+a);
	}
}

class C extends B {
	int c=10;
	void account() {
		System.out.println("B value"+b);
	}
}






public class SIngleInheritance {

	public static void main(String[] args) {
		
		B obj=new B();
		
		C objc=new C();
		
		obj.show();
		obj.display();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		objc.account();
		objc.display();
		objc.show();
		
	}

}
