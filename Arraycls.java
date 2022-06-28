package New;
import java.util.*;

class Arraycls
{
	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter no .of arrays:");
		int n=scan.nextInt();
		System.out.println("Enter no.of elements:");
		int col=scan.nextInt();
		int num2[][]=new int[n][col];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<col;j++)
			{
				num2[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<num2.length;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(" "+num2[i][j]);
			}
			System.out.println();
		}
		
	
}	
}
//		for(int i=0;i<a.length;i++)
//			{	
//				for(int j=0;j<col;j++)
//				{
//					System.out.print(" "+ a[i][j]);
//					
//				}
//				System.out.println();
//			}
//			}System.out.println(a[i][j]);
////		int a[][]= {
////				{1,2,3,4},
////				{7,8,9,20},
////				{6,7,5,1}
////		};
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<4;j++)
//			{
//				System.out.print(" "+ a[i][j]);
//			}
//			System.out.println();
//		}
	
