import java.util.Scanner;
class Dowhiledemo
{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
String guess;
do
{
System.out.println("guess my name");
guess=s.nextLine();
}
while(!"sharmistha".equals(guess));
System.out.println("congratulations u guesssed my name correctly");
}
}