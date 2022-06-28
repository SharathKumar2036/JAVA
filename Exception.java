package New;
public class Exception 
{

	public static void main(String[] args) 
	{
		try 
		{
			int i=9;
			int k=i/0;
		}
		catch (ArithmeticException e) 
		{
			System.out.println("ZeroDivision not possible");
		}

	}

}
