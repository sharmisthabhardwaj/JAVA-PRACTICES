import java.util.Scanner;
class Person
{
String name;
int age;
Person()
{
System.out.println("CONSTRUCTOR");
}

void input()
{
Scanner s=new Scanner(System.in);
System.out.println("enter your name");
name=s.next();
System.out.println("enter your age");
age=s.nextInt();
}
void print()
{
	System.out.println("name is:"+name);
	System.out.println("age is:"+age);
}
void check()
{
	if(age<18)
		System.out.println(" not eligible to vote");
	else
		System.out.println("eligible");
}
}
class PersonTest
{
public static void main(String [] args)
{
Person objPerson= new Person();
Person objPerson1= new Person();
objPerson.input();
objPerson.print();
objPerson.check();
objPerson1.input();
objPerson1.print();
objPerson1.check();
}
}