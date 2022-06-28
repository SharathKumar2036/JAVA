package New;
class Outer{
	int a;
	public void show()
	{
		System.out.println("Outer");
	}
	class Inner{
		public void display()
		{
			System.out.println("Inner");
		}
	}
}
public class Innerclass {
	public static void main(String args[]) {
		Outer obj=new Outer();
		obj.show();
		Outer.Inner n=obj.new Inner();
		n.display();
	}
}
