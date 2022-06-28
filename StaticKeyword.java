package New;
class Student
{
	int rollno;
	int Id;
	static String ceo;
	Student()
	{
		rollno=1;
		Id=2;
		System.out.println("Constructor");
	}
	static {
		ceo="Man";
		System.out.println("IN static");
	}
	
	public void display()
	{
		
		System.out.println(rollno+ " " + Id + " " + ceo);
	}
	
}

public class StaticKeyword {

	public static void main(String[] args) {
		Student student=new Student();		
		student.display();
		Student college=new Student();
		college.rollno=10;
		college.Id=20;
		college.display();
		
		

	}

}
