package New;

abstract class Writer{  //Abstract calss we can define and declare methods which may be abstract or non abtract
	public abstract void write();
}
class Pen extends Writer{
	public void write()
	{
		System.out.println("I am pen");
	}	
}
class Pencil extends Writer
{
	public void write()
	{
		System.out.println("I am Pencil");
	}
}
class Kit
{
	public void man(Writer p)
	{
		p.write();
	}
}
public class Abstract2 {

	public static void main(String[] args) {
		Kit obj=new Kit();
		Writer pc=new Pencil();
		Writer p=new Pen();
		obj.man(p);
	}

}
