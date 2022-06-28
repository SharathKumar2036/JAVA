package New;
class O
{
	public void d()
	{
		System.out.println("In D");
	}
}

public class Anonymousclass {

	public static void main(String[] args) 
	{
		O obj=new O()
				{
					public void d()
					{
					System.out.println("In anonymous inner class");
					}
				};
		obj.d();

	}

}
