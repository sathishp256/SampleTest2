package video6;

import java.util.Arrays;
  
public class Sorting {

	public static void main(String[] args) {
		
		int a[]= {100,300,600,200,400};
		
		char b[]= {'A','F','D','G'};
		
		String c[]= {"HI","BYE","AYE"};
		
		
		System.out.println("Before Sorting");
		
		System.out.println(Arrays.toString(c));
		
		Arrays.sort(c);
		
		System.out.println("after Sorting");
		System.out.println(Arrays.toString(c));
		

	}

}
