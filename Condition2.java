import java.util.Scanner;
class Condition2
{
public static void main(String [] args)
{
Scanner x=new Scanner(System.in);
System.out.println("insert first number");
int a=x.nextInt();
System.out.println("insert second number");
int b=x.nextInt();
System.out.println("insert third number");
int c=x.nextInt();
if(a>b && a>c)
System.out.println("a is greater");
else if(b>c)
System.out.println("b is greater");
else
System.out.println("c is greater");
}}