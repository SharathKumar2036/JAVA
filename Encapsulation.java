package New;
class Enc
{
	private int roll;
	private String name;
	public int getroll()
	{
		return roll;
	}
	public String getname() {
		return name;	
	}
	public void setData(int roll,String name) {
		this.roll=roll;
		this.name=name;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		Enc a=new Enc();
		a.setData(2098,"Sharath");
		a.setData(1595,"Viswa");
		System.out.println(a.getroll());
		System.out.println(a.getname());
		System.out.println(a.getroll());
		System.out.println(a.getname());
	
	}

}
