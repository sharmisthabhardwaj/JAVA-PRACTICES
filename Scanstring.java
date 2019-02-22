import java.util.Scanner;
class Scanstring
{
public static void main(String [] args)
{
Scanner x=new Scanner(System.in);
System.out.println("insert first number");
int a=x.nextInt();
System.out.println("insert second number");
int b=x.nextInt();
int c=a+b;

System.out.println("addition a+b="+c);

System.out.println("enter your name");
String name=x.next();
System.out.println("your name is "+name);
}}
