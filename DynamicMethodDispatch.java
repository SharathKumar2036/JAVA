package New;
class PO
{
	public void show()
	{
		System.out.println("In PO");
	}
}
class OP extends PO
{
	public void show()
	{
		System.out.println("In OP");
	}
}

class KO extends PO
{
	public void show()
	{
		System.out.println("In KO");
	}
}
class Kin extends PO
{
	public void show()
	{
		System.out.println("In Kin");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		PO obj=new OP();//Run-time Polymorphism when 
		obj.show();
		obj=new KO();//Dynamic Method Dispatch which means when different types of objects are refered to through a superclass reference variable  		
		obj.show();
		obj=new Kin();
		obj.show();

	}

}
