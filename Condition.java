import java.util.Scanner;
class Condition
{
public static void main(String [] args)
{
Scanner x=new Scanner(System.in);
System.out.println("insert first number");
int a=x.nextInt();
System.out.println("insert second number");
int b=x.nextInt();
if(a>b)
System.out.println("a is greater");
else
System.out.println("b is greater");
}}