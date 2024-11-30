package video6;

public class Arrays {

	public static void main(String[] args) {
		
		int h[]=new int[5];
		
		h[0]=1;
		h[1]=2;
		h[2]=3;
		
		System.out.println(h[1]);
		System.out.println(h[3]);
		
		System.out.println("l length" + h.length);
		
		int l[]= {11,22,33,44,55,66};
		
		//for(int f:l)
		//{
			//System.out.println(f);
		//}
		
		for(int d=0;d<=l.length-1;d++)
		{
			
			System.out.println(l[d]);
		}
		
		
		
		int a[]=new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		//System.out.println(a[3]);
		
		int b[]= {1,2,3,4,5,6,7,8,9};
		
		//System.out.println(b.length);
		
		/*for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}*/
		
		for(int c:a)
		{
			System.out.println(c);
		}
		
		

	}

}
