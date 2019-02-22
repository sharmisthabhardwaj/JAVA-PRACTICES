import java.util.*;
public class TreeMapExample 
{
    public static void main(String[] args) 
    {
        //Natural ordering of User
        Map<User,String> userMap = new TreeMap<User,String>();
        populateUserMap(userMap);
        System.out.println(userMap.toString());
        diplayMap(userMap);
    }
    private static void diplayMap(Map userMap) 
    {
        Set <User> keySet = userMap.keySet();
        for (User user:keySet) 
        {
            System.out.println(user.toString());
        }
    }
    private static void populateUserMap(Map userMap) {
        userMap.put(new User("Ani","Bha",12), "My Name1");
        userMap.put(new User("Cal","YYY",15), "My Name2");
        userMap.put(new User("XYZ","WER",22), "My Name3");
        userMap.put(new User("SSS","TER",1), "My Name4");
    }
}