package New;
class Calc
{
	public int add(int ... i) 
	{
		int sum=0;
		for(int g : i)
		{
			sum+=g;
		} return sum;
		
	}
}
public class Vararg {

	public static void main(String[] args) {
		Calc obj=new Calc();
		System.out.println(obj.add(1,2,3,4));

	}

}
