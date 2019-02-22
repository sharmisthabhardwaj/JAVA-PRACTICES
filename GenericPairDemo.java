import java.util.Scanner;
public class GenericPairDemo
{
public static void main(String [] args)
{
	pair<String> secretPair = new pair<String>("Happy","day");
	Scanner keyboard=new Scanner(System.in);
	System.out.println("enter two words:");
	String word1 = keyboard.next();
	String word2 = keyboard.next();
	pair<String> inputPair=new pair<String>(word1, word2);
	pair<Integer> secretPair1 = new pair<Integer>(10,20);
	secretPair1.display();
	
	if(inputPair.equals(secretPair))
	{
		System.out.println("you guessed the secret words");
		System.out.println("in the correct order!");
	}
	else
	{
		System.out.println("you guessed incorrectly");
		System.out.println("you guessed");
		System.out.println(inputPair);
		System.out.println("the secret words are");
		System.out.println(secretPair);
	}	
}
}