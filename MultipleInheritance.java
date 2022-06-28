package New;
interface W
{
	public void show();
	
}
interface E 
{
	public void dis();
	
}
class d implements W,E
	{	
	
	 public void show()
	{
	 System.out.println("Hi");
	}

	public void dis()
	{
	 System.out.println("Hi sharath");
	 System.out.print("O162098");
	}
	}
public class MultipleInheritance {	
 
	public static void main(String[] args) 
	{
		d obj=new d();
		obj.dis();
	}

}
