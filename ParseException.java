package New;
import java.util.*;
import java.text.SimpleDateFormat;
public class ParseException {
	static void date(String inputDate)
	{
		try 
		{
			SimpleDateFormat dt=new SimpleDateFormat("dd/mm/yyyy");
			Date date=dt.parse(inputDate);
			System.out.println("Date before converting format" + date);
			SimpleDateFormat out=new SimpleDateFormat("yyyy-MM-DD");
			String outputDate=out.format(date);
			System.out.println("Date after converting format " + outputDate);
			
		}
		catch (java.text.ParseException e) {
			System.out.println("Some error occured while converting date fromats "+e);
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter date in format dd/mm/yyyy");
		Scanner scanner=new Scanner(System.in);
		String inputDate=scanner.nextLine();
		date(inputDate);
	}

}
