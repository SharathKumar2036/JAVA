package New;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		int num;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a num in range 1-3:");
		num=a.nextInt();
		switch (num) {
		case 1: 
			System.out.println("1st case");
			break;
		case 2:
			System.out.println("2nd case");
			break;
			
		case 3:
			System.out.println(65+5);
			break;
		case 4:
			System.out.println("4th last case");
			break;
		default:
			System.out.println("Unexpected value: " + num);
		}

	}

}
