package New;
class D
{
	int age;
	int roll;
	
	public D()//Default Constructor
	{	age=4;
		roll=12;
		System.out.println("Hi");
	}
	
}


public class DefaultConstructor {

	public static void main(String args[])
	{
		D obj = new D();//Here itself default constructor is created in object creation 
	System.out.println(obj.age);
	}
}
