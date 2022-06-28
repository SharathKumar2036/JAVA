package New;
class Q{
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
}

public class MethodOverloading{
	public static void main(String[] args) {
		Q obj=new Q();
		
		obj.add(9,10,98);
		
	}
}


