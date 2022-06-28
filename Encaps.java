package New;
class we
{
	private int a;
	private String name;
	public int geta()
	{
		return a;
	}
	public String getname()
	{
		return name;
	}
	public void setdata(int a,String name)
	{
		this.a=a;
		this.name=name;
	}
}
public class Encaps 
{
	public static void main(String args[])
	{
	we obj=new we();
	obj.setdata(161595,"Viswa");
	obj.setdata(2098,"king");
	System.out.println(obj.geta());
	System.out.println(obj.getname());
	
	}
}
