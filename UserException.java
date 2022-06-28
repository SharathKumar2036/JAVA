package New;
import java.lang.Exception;
public class UserException {

	public static void main(String[] args) {
		try {
			throw new MyException(8);
		} 
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
class MyException extends Exception
{
	int a;
	MyException(int a) {
		this.a=a;
	}
	public String toString()
	{
		return ("Exception number = " + a);
	}
}

