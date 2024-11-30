package video6;

public class Linear {

	public static void main(String[] args) {
		
		
		int a[]= {100,200,300,400,500};
		boolean status=false;
		int element=200;
		
		/*for(int i=0;i<=a.length-1;i++) 
		{
			
			if(a[i]==900)
			{
				System.out.println("Value Found 100");
				status=true;
				break;
			}
		}*/
		
		for (int x:a)
		{
			if(x==element) {
				System.out.println(x);
				status=true; 	    
				break;
			}
		}
		if(status==false) {
			
			System.out.println("element not found");

		}
		
	}

}
