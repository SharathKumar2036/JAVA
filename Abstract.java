package New;
abstract class Abstract1 
{
	public abstract void animalsound();
	public void sound()
	{
		System.out.println("This is pig zzz");//Abstract is used for security and hide the details Using abstract we cant create object and has only one method 
	}
}
class dod extends Abstract1
{
	public void animalsound()
	{
		System.out.println("Eating");
	}
}
public class Abstract
{
	public static void main(String args[]) 
{
		Abstract1 obj=new dod();
		obj.animalsound();
		obj.sound();
		
}
}