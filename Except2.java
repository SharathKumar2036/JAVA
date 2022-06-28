package New;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;


public class Except2 {

	public static void main(String[] args) throws Exception
{
		int j=0;
		System.out.println("Enter a num:");
		BufferedReader br =null;
	try {
		br =new BufferedReader(new InputStreamReader(System.in));
		j=Integer.parseInt(br.readLine());
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
		br.close();
	}
}
}