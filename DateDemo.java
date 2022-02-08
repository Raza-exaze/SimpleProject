import java.time.*;

public class DateDemo
{
public static void main(String args[])
{

LocalDate date=LocalDate.now();
LocalTime time=LocalTime.now();
LocalDateTime datetime=LocalDateTime.now();

//Display Current Date Of System.
System.out.println("Current Date: "+date);

//Display Current Time Of System.
System.out.println("Current Time: "+time);

//Display Current Date && Time Of System.
System.out.println("Date And Time: "+datetime);

}
}