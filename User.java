public class User implements Comparable
{
String firstname;
String lastname;
int id;
User(String firstname,String lastname,int id)
{
	this.firstname=firstname;
	this.lastname=lastname;
	this.id=id;
}
public String toString()
{
	return firstname+""+lastname+""+id;
}
public int compareTo(Object arg0) 
{
	// TODO Auto-generated method stub
	return 0;
}
}