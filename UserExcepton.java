package New;
import java.lang.Exception;
public class UserExcepton {
		public static void main (String ars[])
		{
			int i=0;int j=9;
			
			try
			{
				int k=i/j;
				if(k==0)
						throw new Exception("This is not possible");
				System.out.println(k);
			}
			catch(Exception e)
			{
				System.out.println("Error" +e);
			}
			
		}
}
