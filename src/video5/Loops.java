package video5;

public class Loops {

	public static void main(String[] args) {
		
		//example1 pront 1-10 numbers
		
		int i=1;
		
		while(i<=10) // condition
		{
			System.out.println(i); //statments
			i++;  //inceordec
		}
		
		//example 2 hello message
		
		String sample="Hello";
		
		int x=1;
		
		while(x<=10) 
		{
		
			System.out.println(sample);
			x++;
		}
		
		int v=1;
		
		while(v<=10)
		{
			if(v%2==0)
			{
			System.out.println("even number"+v);
			}
			else
			{
				System.out.println("odd number"+v);
			}
			v++;
		}
		
		int r=10;
		
		while(r>0)
		{
			System.out.println(r);
			r--;
		}
		
		
		

	}

}
