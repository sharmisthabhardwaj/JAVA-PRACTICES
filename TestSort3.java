import java.util.ArrayList;
import java.util.Collections;

public class TestSort3
{
public static void main(String [] args)
{
	ArrayList<Student>a1=new ArrayList<Student>();
	a1.add(new Student(111,"john",29));
	a1.add(new Student(222,"mike",21));
	a1.add(new Student(333,"mary",26));
	Collections.sort(a1);
	Collections.reverse(a1);
	for(Student st:a1) 
	{
		System.out.println(st.rollno+""+st.name+""+st.age);	
	}	
}
}