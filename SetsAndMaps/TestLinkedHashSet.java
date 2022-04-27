
import java.util.*;

public class TestLinkedHashSet {

    public static void main(String[] args) {

        //Create a Hash Set:
        Set<String> set = new LinkedHashSet<>();

        //Add Strings to the set:
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        System.out.println(set);

        //Display the elements of the LinkedHashSet:
        for(String element: set){
            System.out.print(element.toLowerCase() + " ");
        }
    }
}
