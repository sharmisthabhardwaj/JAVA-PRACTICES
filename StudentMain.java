import java.util.Scanner;
class Student
{
private String name;
private int rollNumber;
private String branch;
private float result;
int[]marks=new int[5];
public void input()
{
Scanner s=new Scanner(System.in);
System.out.println("enter students name");
name=s.next();
System.out.println("enter student rollnumber");
rollNumber=s.nextInt();
System.out.println("enter students branch");
branch=s.next();
System.out.println("enter students marks in 5 subjects");
for(int i=0;i<5;i++)
{
marks[i]=s.nextInt();
}
System.out.println("enter students result");

int sum=0;
for(int i=0;i<5;i++)
{
sum=sum+marks[i];
}
result=(float)((sum*100)/500);
}

public void print()
{
	System.out.println("name is:"+name);
	System.out.println("rollNumber is:"+rollNumber);
	System.out.println("branch is:"+branch);
	System.out.println("result is:"+result);
}
public void check()
{
	if(result>=60)
	System.out.println("first division");
	else if(result>=45 && result<=60)
	System.out.println("second division");
	else
	System.out.println("third division");	
}
}
class StudentMain
{
public static void main(String [] args)
{
Student obj= new Student();
obj.input();
obj.print();
obj.check();
}
}