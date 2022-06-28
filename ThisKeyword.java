package New;
class h
{
	int num1;
	int num2;

	public h(int num1,int num2)
	{
		this.num1=num1;//'this' keyword is used to eliminate confusion b/w instance variable and parameter with the same name
		this.num2=num2;//Invokes current object
		
	}
}
public class ThisKeyword {

	public static void main(String[] args) {
		h obj = new h(10,20);
		System.out.println(obj.num1);

	}

}
