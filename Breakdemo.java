import java.util.Scanner;
class Breakdemo
{
public static void main(String [] args)
{
Scanner x=new Scanner(System.in);
int sum=0; int i;
for(i=1;i<=5;i++)
{
System.out.println("insert number");
int a=x.nextInt();
if(a<0)
{
System.out.println("negatives not allowed");
break;
}
else
	sum=sum+a;
}
System.out.println("sum is "+(sum));
}
}