package New;
import javax.print.attribute.standard.PrinterInfo;

interface L // In interface we only declare methods
{
	public int multi(int i,int j);

}
interface M
{
	public int add(int i,int j); 
}
class P implements L,M
{
	public int multi(int i,int j)
	{
		return i*j;
	}
	public int add(int i,int j)
	{
		return i+j;
	}
}
public class Interface {
	public static void main(String[] args) {
		P obj=new P();
		int k=obj.add(10,2);
		System.out.println(k);
	}

}
