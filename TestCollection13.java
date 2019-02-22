import java.util.*;
class TestCollection13
{
public static void main(String [] args)
{
HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(111,"john");
hm.put(222,"jim");
hm.put(333,"mike");
for(Map.Entry m:hm.entrySet()){
System.out.println(m.getKey()+""+m.getValue());
}}}