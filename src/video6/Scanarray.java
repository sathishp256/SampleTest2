package video6;
import java.util.Scanner;
import java.util.Arrays;

public class Scanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println("Enter the number for"+i+"position:");
			a[i]=sc.nextInt();
		}
		
		
		System.out.println("Printing all array numbers");
		
		System.out.println(Arrays.toString(a));
		

	}

}
