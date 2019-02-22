import java.util.ArrayList;
import java.util.Collections;

public class MyBasicArrayList 
{ 
	public static void main(String [] args)
	{
	ArrayList<String> al=new ArrayList<String>();
	al.add("python");  
	  al.add("c");  
	  al.add("c++");
	  al.add("sql"); 
	  al.add("hadoop"); 
	  System.out.println("element at index 1:"+al.get(1));
	  System.out.println("does list contains java?"+al.contains("java"));
	  System.out.println("index of sql is"+al.indexOf("sql"));
	  al.add(2,"play");
	  System.out.println(al);
	  System.out.println("is arralist empty?"+al.isEmpty());
	  System.out.println("index of sql is"+al.indexOf("sql"));
	  System.out.println("size of arraylist is:"+al.size());
      Collections.sort(al);
      System.out.println(al);
	}
}	