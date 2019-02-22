import java.util.Scanner;
class Arithematicoperator
{
public static void main(String [] args)
{
Scanner x=new Scanner(System.in);
System.out.println("insert first number");
int a=x.nextInt();
System.out.println("insert second number");
int b=x.nextInt();
int c=0;
System.out.println("enter operator");
char op=x.next().charAt(0);

switch(op){
case '+': c=a+b; 
System.out.println("sum"+c);
break;
case '-': c=a-b;
System.out.println("subtraction"+c);
break;
case '/': c=a/b;
System.out.println("division"+c);
break;
case '*': c=a*b;
System.out.println("multiplication"+c);
break;
default:
System.out.println("invalid");
}
}
}