package New;
import java.util.Scanner;
import java.util.spi.LocaleNameProvider;
import java.util.Arrays;

public class Arraydec {

	public static void main(String[] args) {
		Scanner n= new Scanner(System.in);
		System.out.println("Enter no.of elements:");
		int a=n.nextInt();
		int g[]=new int[a];
		for(int i=0;i<a;i++)
		{
			g[i]=n.nextInt();
		}
		Arrays.sort(g);
		for(int i=0;i<g.length;i++)
		{
			
			System.out.println(g[i]);
		}
		
		/*int a[]=new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			sum=sum+a[i];
		}
		System.out.println("Sum of array elements" + sum);*/
	}

}
