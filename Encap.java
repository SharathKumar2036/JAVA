package New;
class G
{
	int a;
	String name;
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
public class Encap {

	public static void main(String[] args) {
		G a=new G();
		a.setdata(162098,"Sharath");
		a.setdata(161595,"Viswa");
		System.out.println(a.getname());
		
		
	}
}
