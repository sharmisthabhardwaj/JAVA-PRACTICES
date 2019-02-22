import java.util.Scanner;
class Table
{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
System.out.println("insert first number");
int a=s.nextInt();
int i;
for(i=1;i<=10;i++)
{
System.out.println(a+"x"+i+"="+a*i);
}
}
}