package New;

class man
{
	public void a()
	{
		System.out.println("In king");
	}
}
class men extends man
{	
	public void a()
	{
	System.out.println("In men");
	}
}
public class Overridavoid {

	public static void main(String[] args) 
	{
		men obj=new men();
		obj.a();
	}

}