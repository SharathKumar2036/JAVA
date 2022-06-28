package New;
class J{
	public void add(int i,int j)
	{
		System.out.println(i+j);
	}
}
class Z extends J
{
	public void add(int i,int j)
	{	super.add(6,5);
		System.out.println(i-j);
	}
}
	

public class Override {

	public static void main(String[] args) {
		Z obj=new Z();
		obj.add(5,2);

	}

}
