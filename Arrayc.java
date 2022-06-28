package New;
import java.util.*;


public class Arrayc {

	public static void main(String[] args) {
		Scanner n1 = new Scanner(System.in);
		System.out.println("Enter no.of elements:");
		int num=n1.nextInt();
		int nums[]=new int[num];
		for(int i=0;i<num;i++)
		{
			
			nums[i]=n1.nextInt();
		}
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]);
			
		}
		
	}

}
