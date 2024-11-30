package Video3;

public class IncrementOperator {

	public static void main(String[] args) {
		
		int a=10;
		System.out.println(a);
		
		//a=a+1;
		int result=a++;
		
		 result=++a;
		 
		 result=a--;
			
		result=--a;
		
		
		
		//System.out.println(result);
		
		int q=10;
		//q=q+5;
		//q+=5;
		//q-=5;
		//q*=2;
		//q/=2;
		//q%=2;
		
		int w=200,r=100;
		
		int result1=(w>r)?w:r;
				
		System.out.println("conditional"+result1);
		
		int t=(1==1)?100:200;
				
		System.out.println(t);
		
		int age=30;
		
		String qa=(age>=18)?"ELigible":"Not Eligible";
		
		System.out.println(qa);

	}

}
