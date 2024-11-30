package video6;

import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner sj=new Scanner(System.in);
		
		int e[]=new int[5];

		for(int v=0;v<e.length;v++) {
			
			System.out.println("Enter the number for"+v+"position:");
			e[v]=sj.nextInt();
		}
		
		System.out.println(Arrays.toString(e));
		int a[]=new int[5];
		
		a[0]=10;
		a[1]=20;
		a[3]=30;
		
		//System.out.println(a[0]);
		
		int b[]= {1,2,3,4,5};
		
		//System.out.println(b[2] );
		
		//System.out.println(a.length);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		for (int x:a)
		{
			System.out.println(x);
		}
		
		// two dimensions
		int c[][]=new int[5][3];
		
		c[0][0]=1;
		c[0][1]=2;
		c[1][0]=3;
		c[1][1]=4;
		
		//System.out.println(c[0][0]);
		
		int d[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(d[0][0]);
		
		System.out.println(d.length);
		System.out.println(d[0].length);
		
		for(int w[]:d) {
			
			for(int f:w) {
				
				System.out.println(f + " ");
				
			}
		}
		
		Object cb[]= {1,12.5f,'G',};
		
		for (Object u:cb) {
			
			System.out.println(u);
		}
		
		//int e[]=new int[5];
		
		//Arrays.sort(e);
		

		//System.out.println(Arrays.toString(e)); 
		
		
	}

}
