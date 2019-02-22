import java.util.ArrayList;
import java.util.List;
public class PlayerList
{
	ArrayList playerArray;
	List subListObj;
PlayerList()
{
	playerArray = new ArrayList();
	subListObj = new ArrayList();
}
public void add()
{
	for(int c = 0;c<5;c++)
	{
		playerArray.add(new Integer(c));
	}
	playerArray.add("martina");
	playerArray.add("serena");
	playerArray.add("venus");
	playerArray.add("serena");
	System.out.println();
}	
public void search()
{
	System.out.println();
	System.out.println("*******************************+******************************");
	System.out.println("search for an object and return"+"the first and last position");
	System.out.println("*******************************+******************************");
	System.out.println();
	System.out.println("first occurrence of the string"+"\"serena\" is at position"+ playerArray.lastIndexOf("serena"));
	System.out.println();
}
void display()
{
	System.out.println("*******************************+******************************");
	System.out.println("retrieve objects from the Arraylist");
	System.out.println("*******************************+******************************");
	System.out.println();
	for(int ctr=0; ctr< playerArray.size(); ctr++)
	{
		System.out.println(""+playerArray.get(ctr));
	}
}
void extract()
{
	System.out.println("*******************************+******************************");
	System.out.println("extract a sublist and"+"then print the new list");
	System.out.println("*******************************+******************************");
	System.out.println();
	subListObj=playerArray.subList(5, playerArray.size());
	System.out.println("new sub-list from index 5 to"+playerArray.size()+"is:"+subListObj);
	System.out.println();
}}