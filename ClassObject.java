package New;
class A
{
	int age;
	int roll;
	int result;
	
	public void perform()
	{
			result=age/roll;
	}
	
	
}


public class ClassObject {

	public static void main(String args[])
	{
		A obj = new A();
		obj.age=12;
		obj.roll=2;
		obj.perform();
	System.out.println(obj.result);
	}
}
