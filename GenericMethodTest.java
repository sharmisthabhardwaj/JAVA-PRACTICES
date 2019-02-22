public class GenericMethodTest 
{
public static <E> void printArray(E[] inputArray )
{
	for(E element: inputArray)
	{
		System.out.printf("%s",element);
	}
	System.out.println();
}
public static void main(String [] args)
{
	Integer[] intArray = {1,2,3,4,5};
	Double[] doubleArray = {1.1 , 2.2 , 3.3 , 4.4 , 5.5 };
	Character[] charArray = {'h','e','l','l','o'};
	
	System.out.println("Array integerArray contains:");
	printArray(intArray);
	
	System.out.println("Array doubleArray contains:");
	printArray(doubleArray);
	
	System.out.println("Array characterArray contains:");
	printArray(charArray);
}}