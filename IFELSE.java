package New;
import java.util.Scanner; 
public class IFELSE 
{
	
	public static void main(String args[])
	{
	
		Scanner myObj = new Scanner(System.in);
	    Integer num;
	    
	    // Enter username and press Enter
	    System.out.println("Enter ");
	    
	    num = myObj.nextInt();
	    if(num%2==0) 
	    {
	    	System.out.println("Even"+num);
	    }
	    else
	    {
	    	System.out.println("Odd"+num);
		}
	    
	        
	}

}
