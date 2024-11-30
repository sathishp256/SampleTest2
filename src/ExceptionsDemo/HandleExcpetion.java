package ExceptionsDemo;

import java.util.Scanner;

public class HandleExcpetion {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		
		//exmaple1
		
		try 
		{
		System.out.println("Enter your number");
			
		int a=sc.nextInt();
		System.out.println(100/a);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		
		
		System.out.println("Program started");
		System.out.println("program inprogress");
		System.out.println("Program completed");
		
		
		


	}

}
