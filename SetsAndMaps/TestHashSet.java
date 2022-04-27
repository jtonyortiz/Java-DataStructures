import java.util.*;

public class TestHashSet {
    public static void main(String[] args) {
        //Create a Hash Set:
        Set<String> set = new HashSet<>();

        //Add Strings to the set:
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        //Display Set:
        System.out.println(set);

        //Display elements of the set:
        for (String s: set){
            System.out.print(s.toUpperCase() + " ");
        }


        //Process the elements useing a forEach method:
        System.out.println();
        set.forEach(e -> System.out.print(e.toLowerCase() + " "));
        
    }
}