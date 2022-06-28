package New;
class Y
{
	public Y()
	{
		System.out.println("Default  one");
	}
	public Y(int a)
	{
		System.out.println(a + " Parameterized");
	}
}
class r extends Y
{
	public r()
	{
		System.out.println("Class B");
	}
	public r(int i)
	{	
		System.out.println(i);
	}
}
public class Super {
	public static void main(String args[])
	{
		r obj=new r(10);
		
	}
}
