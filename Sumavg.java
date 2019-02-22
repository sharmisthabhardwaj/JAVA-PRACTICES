import java.util.Scanner;
class Sumavg
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
int sum=a+b+c;

System.out.println("addition a+b+c="+sum);

float avg=sum/2;
System.out.println("avg is"+avg);
}}