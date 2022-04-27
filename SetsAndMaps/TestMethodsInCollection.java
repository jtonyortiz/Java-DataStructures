import java.util.Set;
import java.util.HashSet;

public class TestMethodsInCollection {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        //Add Strings to set1:
        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Beijing");

        System.out.println("set1 is " + set1);
        System.out.println(set1.size() + " elements in set1");

        //Delete a string from set1:
        set1.remove("London");
        System.out.println("\nset1 is " + set1);
        System.out.println(set1.size() + " elements in set1");

        //Create set2:
        Set<String> set2 = new HashSet<>();

        //Add Strings to Set2:
        set2.add("London");
        set2.add("Shanghai");
        set2.add("Paris");
        

        System.out.println("\nset2 is: " + set2);
        System.out.println(set2.size() + " elements in set2");

        //Check if element is in set:
        System.out.println("\nIs Taipei in set2? " + set2.contains("Taipei"));

        //Add All Set2 to set1:
        set1.addAll(set2);
        System.out.println("\nAfter adding set2 to set1, set1 is " + set1);


        //Remove set2 from set1:
        set1.removeAll(set2);
        System.out.println("After removing set2 from set1, set1 is " + set1);

        //Retaining common elements:
        set1.retainAll(set2);
        System.out.println("After retaining common elements in set2 " + " and set2, set1 is " + set1);

    }
}
