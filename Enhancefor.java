package New;
import java.util.Scanner;

public class Enhancefor {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of arrays:");
		int n=scan.nextInt();
		System.out.println("ENter no. elements in each array: ");
		int col=scan.nextInt();
		int a[][]=new int[n][col];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=scan.nextInt();
				
			}
		}
		System.out.print("2D Elements are : \n");
		for(int k[]: a)//Enhanced for loop
		{
			for(int i=0;i<n;i++)
			for(int l:k)
			{
				System.out.print(" " + l);
		
			}
			System.out.println();
		}

	}

}
