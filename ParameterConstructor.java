package New;
class F
{
		int age;
		int roll;
		
	public F()//Default Constructor
		{	age=4;
			roll=12;
			System.out.println("This is Default Constructor");
		}
	public F(int a,int b)//Parameterized Constructor
		{	age=a;
			roll=b;
		System.out.println("This is Parameter Constructor");
		}
		
}

public class ParameterConstructor {

	public static void main(String[] args)
	{
		F obj = new F(5,10);
		
		System.out.println(obj.age+obj.roll);
		
	}

}
