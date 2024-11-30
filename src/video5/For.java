package video5;

public class For {

	public static void main(String[] args) {
	
		//ex1 for loop
		
		/*for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}*/
		
		/*for(int i=2;i<=10;i+=2)
		{
			System.out.println(i);
		}*/
		
		/*for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println("even number"+i);
			}
			else
			{
				System.out.println("odd number"+i);
			}
		}*/
		for(int i=1;i<=10;i++)
		{
			
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
