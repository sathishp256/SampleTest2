package ExceptionsDemo;

import java.util.Scanner;

public class ExceptionRevision {

	public static void main(String[] args) throws InterruptedException {
		
		//unchecked exceptions
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENTER THE INPUT");
		try {
			int i1=sc.nextInt();
			System.out.println(100/i1);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally 
		{
			System.out.println("AAA");
		}
				
		System.out.println("PROGRAM IN PROGRESS");
		System.out.println("PROGRAM COMPLETED");
		
		String s3="100";
		try {
		int i4=Integer.parseInt(s3);
		System.out.println(i4);
		}
		catch(Exception e2)
		{
			System.out.println(e2.getMessage());
		}
		
		Thread.sleep(1000);
		
		
		

		
	
	}

}
