package New;

import java.util.Scanner;
public class Even
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num:");
		int a= sc.nextInt();
		try
		{
			if(a%2==0)
			{
				System.out.println("is even"+a);
			}
			else
			{
			System.out.println("Odd" +a);
			}
		
		}
		catch (NullPointerException e)
		{
			// TODO: handle exception
		}
	}

}
