package ExceptionsDemo;

import java.util.Scanner;

public class ExceptionSample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//exmaple1
		/*System.out.println("Enter your number");
		
		int a=sc.nextInt();
		
		System.out.println(100/a);*/
		
	
		int a[]=new int[5];

		
		System.out.println("Enter the value for[0-4] position");
		
		int pos=sc.nextInt();
		
		System.out.println("Enter the Value");
			
		int val=sc.nextInt();
		try 
		{
		a[pos]=val;
		}
		catch(Exception e) {
			System.out.println("Array size is 0-4, don't give beyond that");
		}
		try
		{
		System.out.println(a[pos]);
		}
		catch(Exception b)
		{
			System.out.println(b.getMessage());
		}
		finally
		{
		System.out.println("Program started");
		System.out.println("program inprogress");
		System.out.println("Program completed");
		}
		
		

	}

}
