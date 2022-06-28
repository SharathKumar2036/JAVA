package New;
import java.lang.Exception;

public class ThrowandThrows {
		static void div() throws ArithemetickException//To declare Exception with method signature
		{
			System.out.println("Inside method");
			throw new ArithemetickException("Exception");// Used to throw an exception 
		}
		public static void main(String[] args) throws ArithemetickException 
		{
			try
			{ 
				div();
			}
			finally 
			{
				System.out.println("Caught");
			}
	}
 
}
class ArithemetickException extends Exception
{	ArithemetickException(String exceptionText)
	{
	super(exceptionText);
	}
}
