package New;
class U{
	public U()
	{
		System.out.println("IN A");
	}
	public U(int i)
	{
		System.out.println("IN A int");
	}
}
class KJ extends U
{
	public KJ() 
	{	super();
		System.out.println("In B");
	}
	public KJ(int i)
	{
		
		System.out.println("In int B");
	}
}
public class SuperDemo {
	public static void main(String[] args) {
		KJ obj=new KJ();

	}

}
