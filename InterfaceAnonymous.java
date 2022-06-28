package New;
interface S
{
	int multi(int i,int j);
}
public class InterfaceAnonymous
{

	public static void main(String[] args)
	{
		S obj=new S()
				{
					public int multi(int i,int j)
					{
						return i*j;
					}
				};
			System.out.println(obj.multi(10, 2));

	}

}
