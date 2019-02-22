import java.util.*;
 class Book 
{
int id;
String name, author, publisher;
int quantity;
public Book(int id, String name, String author, String publisher, int quantity)
{
	this.id=id;
	this.name=name;
	this.author=author;
	this.publisher=publisher;
	this.quantity=quantity;
}
}
public class ArrayListExample
{
	public static void main(String [] args)
	{
		List<Book> list= new ArrayList<Book>();
		Book b1=new Book(101,"let us c","yashwant kanetkar","bpb",8);
		Book b2=new Book(102,"data communications & networking","forouzan","mc graw hill",4);
		Book b3=new Book(103,"operating system","galvin","wiley",6);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		for(Book b:list)
	{
	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);		
	}
    }
}