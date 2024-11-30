package OOPS;

import java.util.Arrays;

public class arraypractice {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		
		a[0]=1;
		
		int a1[]= {1,2,4,5,6};
		
		System.out.println(a1.length);
		
		System.out.println(a1[2]);
		
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}
		
		for(int e:a1) {
			System.out.println(e);
		}
		
		int cc[][]=new int[5][3];
		
		cc[0][0]=100;
		cc[0][1]=200;
		cc[0][2]=300;
		
		int gk[][]= {{1,2,3},{3,4,5},{6,7,8}};
		System.out.println(gk[2].length);
		
		System.out.println(gk[0][1]);
		
		for(int []ds:gk) {
			for(int r:ds) {
				System.out.println(r);
			}
		}
		
		Object []nm= {1,"Hi","Hello",10.45f,'a'};
		
		for(Object i:nm) {
			System.out.println(i);
		}
		
		System.out.println(Arrays.toString(a1));
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
