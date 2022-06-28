//package New;
//
//public class Foreach {
//
//	public static void main(String[] args) {
//		int b[]= {3,4,5,6};
//		for(int j:b)
//		{
//			System.out.print(j);
//		}
//
//	}
//	
//}

package New;

public class Foreach
{

	public static void main(String[] args)
{
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		int c[]= {9,10,11,12};
		int d[]= {0,23,45,76};
		
		int e[][]= {a,b,c,d};
			
		
		
		for(int h[]:e)
		{
			for(int k:h)
			{
				System.out.print(" "+k);
			}
			System.out.println();
		}
}
}
	

	


