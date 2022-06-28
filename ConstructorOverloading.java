package New;
import java.security.PublicKey;

public class ConstructorOverloading {

	public static void main(String[] args) {
		ConstOver obj = new ConstOver(3,4,"Hi");
		
	}

}

class ConstOver
{	
	
	int num;
	int n;
	String name;
	public ConstOver(int i) 
	{
		num=i;
		n=0;
		name="Sharath";
	}
	public ConstOver(int i,int j) 
	{
		num=i;
		n=j;
		name="Nothing";
	}
	public ConstOver(int i,int j,String op)
	{
		num=i;
		n=j;
		name=op;
	}
}
	
