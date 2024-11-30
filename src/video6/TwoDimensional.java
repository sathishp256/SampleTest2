package video6;

public class TwoDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// app1 devclration of two dimens array
		
		int g[][]=new int[5][4];
		
		g[0][1]=111;
		g[0][0]=222;
		
		System.out.println(g[0][1]);
		
		int k[][]= {{0,0,0},{1,1,1},{2,2,2}};
		
		for(int s[]:k)
		{
			for(int y:s) {
				
				System.out.println(y);
			}
			
		}
		
		System.out.println(k[2][1]);
		
		System.out.println("k length" +k.length);
		System.out.println("k coloumns"+ k[0].length);
		
		int a[][]=new int[3][2];
		
		a[0][0]=1;
		a[0][1]=2;
		
		a[1][0]=3;
		a[1][1]=4;
		
		a[2][0]=5;
		a[2][1]=6;
		
		// apprch2
		
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		//System.out.println(b.length);
		//System.out.println(b[1].length);
		
		//System.out.println(b[0][1]);
		
		/*for(int i=0;i<=2;i++) {
			for(int j=0;j<=1;j++)
			{
				System.out.println(b[i][j]+" ");
			}
			System.out.println();
		}*/
		
		for(int arr[]:b)
		{
			for(int y:arr)
			{
				System.out.println(y);
			}
		}

	}

}
