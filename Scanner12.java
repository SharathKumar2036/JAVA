package New;
import java.util.Scanner;
import java.lang.Exception;
public class Scanner12 {

	public static void main(String[] args) {
		int n=0;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Entered number:" +n);
		int k=0;
		
		try {
			int b=n/k;
		}
		catch (Exception e) {
			System.out.println("Error" +e);
		}
	}

}
