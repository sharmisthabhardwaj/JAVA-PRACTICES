import java.util.*;
 
public class DateDemo
{
    public static void main(String[] args)
    {
        Date mydate = new Date();
        System.out.println("System date : "+ mydate.toString() );

	int d = mydate.hashCode();
        System.out.println("Amount (in ms) by which time" + 
                           " is shifted :  " + d);

 	Date date1 = new Date(2016, 11, 18);
        Date date2 = new Date(1997, 10, 27);

	// Use of after() to check date2 is after date1
        boolean a = date2.after(date1);
        System.out.println("Is date2 is after date1 : " + a);

	// Use of clone() method
        Object date3 = date1.clone();
        System.out.println("Cloned date3 :" + date3.toString());
        System.out.println("");

	// Use of before() to check date2 is after date1
        boolean b = date2.before(date1);
        System.out.println("Is date2 is before date1 : " + a);

		// Use of equal() method
        boolean r1 = date1.equals(date2);
        System.out.println("Result of equal() r1 : " + r1);

// hash code

	Date date10 = new Date(2016, 11, 20);
        Date date20 = new Date(2016, 11, 20);
        Date currentDate = new Date();
 
        System.out.println("date1 equals() date2 :- " + date1.equals(date2));
 
        System.out.println("hash code date1:- " + date1.hashCode());
        System.out.println("hash code date2:- " + date2.hashCode());
        System.out.println("hash code:- " + currentDate.hashCode());
}
}
 
 