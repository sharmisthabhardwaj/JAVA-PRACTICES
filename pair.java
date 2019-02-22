public class pair<T>
{
private T first;
private T second;

public pair() 
{
	first=null;
	second=null;
}
public pair(T firstItem, T secondItem)
{
	first=firstItem;
	second=secondItem;
}
public void setfirst(T newFirst)
{
	first=newFirst;
}
public void setSecond(T newSecond)
{
	second=newSecond;
}
public T getFirst()
{
	return first;
}
public T getSecond()
{
	return second;
}
public String toString()
{
	return("first:"+first.toString()+"\n" +"second:"+second.toString());
}
public boolean equals(Object otherObject)
{
	if(otherObject==null)
		return false;
	else if (getClass() !=otherObject.getClass())
		return false;
	else
	{
		pair<T> otherPair = (pair<T>)otherObject;
		return(first.equals(otherPair.first) && second.equals(otherPair.second));
	}
		
}
void display()
{
System.out.println(first+""+second);
}
}
