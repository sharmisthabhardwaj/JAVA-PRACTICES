import java.util.Comparator;

public class StudentComparator {
int rollno;
String name, address;
public StudentComparator(int rollno, String name, String address)
{
	this.rollno=rollno;
	this.name=name;
	this.address=address;
}
public String toString()
{
	return this.rollno+"  "+this.name+"  "+this.address;
}
}

class Sortbyroll implements Comparator<StudentComparator>
{
	public int compare(StudentComparator a, StudentComparator b)
	{
		return a.rollno-b.rollno;
	}
}
class Sortbyname implements Comparator<StudentComparator>
{
	public int compare(StudentComparator a, StudentComparator b)
	{
		return a.name.compareTo(b.name);
	}
}
class SortbyAddress implements Comparator<StudentComparator>
{
	public int compare(StudentComparator a, StudentComparator b)
	{
		return a.address.compareTo(b.address);
	}
}