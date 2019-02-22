import java.util.Scanner;
class Oddeven
{
public static void main(String [] args)
{
Scanner x=new Scanner(System.in);
System.out.println("insert number");
int a=x.nextInt();
if(a%2==0)
System.out.println("even");
else
System.out.println("odd");
}}