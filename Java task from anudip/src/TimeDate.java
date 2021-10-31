import java.time.*;
import java.time.format.DateTimeFormatter;
public class TimeDate 
{

	public static void main(String[] args) 
	{
		System.out.println("Today's Date is");
		LocalDate day = LocalDate.now();
		DateTimeFormatter formatedDate = DateTimeFormatter.ofPattern("MMM dd, yyyy");
		String date = day.format(formatedDate);
		System.out.println(date);
		
		System.out.println("Now the time is");
		LocalTime when = LocalTime.now();
		DateTimeFormatter formatedTime = DateTimeFormatter.ofPattern("HH:mm a");
		String time = when.format(formatedTime);
		System.out.println(time);
		
	}
}
