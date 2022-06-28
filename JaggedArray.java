package New;

public class JaggedArray 
{

	public static void main(String[] args)
{
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		int c[]= {9,10,11,12};
		int d[]= {0,23,45,76};
		
		int e[][]= {a,b,c,d};
			
		for(int i=0;i<e.length;i++)
		{
			for(int j=0;j<e[i].length;j++)
			{
				System.out.print(e[i][j]);
			}
			System.out.println();

		}
		
}
}
	

	


