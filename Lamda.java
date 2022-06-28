package New;
interface king//Functional INterface which has only one method in its interface class. Marker interface class which has no methods in the interface class.
{
	void show();
}
public class Lamda {

	public static void main(String[] args) {
		king obj=() -> System.out.println("This is Lamda function used in FUnction interface");    //() - > == public void show()
		obj.show();
	}

}
