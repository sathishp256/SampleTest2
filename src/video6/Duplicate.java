package video6;

public class Duplicate {

	public static void main(String[] args) {
		
		int a[]= {100,200,300,100,100,400,100};
		
		int count=0;
		int duplicate=200;
		boolean status=false;
		for(int i=0;i<a.length;i++) 
		{
			
			if(a[i]==duplicate)
			{
				count++;	
				status=true;
			}
		}
		if(status==false) {
			System.out.println("No Duplicates Found");
		}
		
		System.out.println(count);

	}

}
