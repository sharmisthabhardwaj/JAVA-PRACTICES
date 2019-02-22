import java.util.Calendar;
import java.util.Date;

class CalendarDemo {
     
public static void main(String[] args) {
   Calendar c = Calendar.getInstance();

    System.out.println("Day : " +c.get(Calendar.DATE));
    System.out.println("Month : " +c.get(Calendar.MONTH));
   System.out.println("Year : " + c.get(Calendar.YEAR));
System.out.println("Day of week : " +c.get(Calendar.DAY_OF_WEEK));
   System.out.println("Hour : " + c.get(Calendar.HOUR));

	c.add(Calendar.MINUTE , 30);
        Date objDate = c.getTime();
        System.out.println("\nDate and Time after adding 30" + "minutes to current time:\n");
        System.out.println(objDate);

}
}