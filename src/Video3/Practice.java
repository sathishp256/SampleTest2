package Video3;

public class Practice {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		System.out.println(a+b); //30
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
		int p=10;
		
		p=p+1;
		
		p=++p;
		
		p=p++;
		
		System.out.println(p);
		
		//p=p--;
		
		//p=--p;
		
		
		System.out.println(p);
		
		int l=100;
		//l+=500;
		//l-=500;
		//l*=2;
		//l/=10;
		l%=10;
		System.out.println(l);
		
		//?a:b
		
		int m=10, k=20;
		
		int gg=(10>20)?m:k;
		
		System.out.println(gg);
		
		int r=10, v=20;
		
		int n;
		
		n=r;
		r=v;
		v=n;
		
		//r=r+v;
		//v=r-v;
		//r=r-v;
		System.out.println("r value:"+r);
		System.out.println("v value:"+v);
	}

}
