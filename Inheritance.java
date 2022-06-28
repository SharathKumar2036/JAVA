package New;
class T						//SUPER CLASS
{
	public int add(int i,int j)
	{
		return i+j;
	}
}
class B extends T				//SUB CLASS
{
	public int sub(int i,int j) 
	{
		return i-j;
	}
}
class C extends B
{	
	public int mult(int i,int j) 
	{
		return i*j;
	}
}

public class Inheritance {//multilevel Inheritance

	public static void main(String[] args) {
		C obj=new C();
		System.out.println(obj.add(1, 5));
		System.out.println(obj.sub(1, 5));
		System.out.println(obj.mult(1, 5));
	}

}
