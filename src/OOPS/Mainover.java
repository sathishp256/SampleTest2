package OOPS;

class Main1 {
	void main() {
		System.out.println("Main1");
	}
	void main(int a) {
		System.out.println(a);
	}
	void main(int a,int b) {
		System.out.println(a+b);
	}
	void main(int a,float b) {
		System.out.println(a+b);
	}
	void main(float b,int a) {
		System.out.println(a+b);
	}
}
public class Mainover {

	public static void main(String[] args) {
		
		Main1 mm=new Main1();
		
		mm.main();
		mm.main(1,2.5f);

	}

}
