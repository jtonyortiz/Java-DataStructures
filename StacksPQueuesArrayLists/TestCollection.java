import java.util.*;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList<String> collection1 = new ArrayList<>();

        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");

        System.out.println("A list of cities in collection1: ");
        System.out.println(collection1);

        //Check if dallas is in the collection:
        System.out.println("\nIs Dallas in collection1?" + collection1.contains("Dallas"));

        collection1.remove("Dallas");

        System.out.println("\n" + collection1.size() + 
            " cities are in collection1 now");


        
        //Create a new collection useing the Collection object
        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");

        System.out.println("\nA list of cities in collection2: ");
        System.out.println(collection2);


        //Cloning an ArrayList:
        ArrayList<String> c1 = (ArrayList<String>)(collection1.clone());
        c1.addAll(collection2);
        System.out.println("\nCities in collection1 or collection2: ");
        System.out.println(c1);

        //Cities in collection1 and collection2:
        c1 = (ArrayList<String>)(collection1.clone());
        c1.retainAll(collection2);
        System.out.println("\nCities in collection1 and collection2: ");
        System.out.println(c1);


        c1 = (ArrayList<String>)(collection1.clone());
        c1.removeAll(collection2);
        System.out.print("\nCities in collection1, but not in 2: ");
        System.out.println(c1);

    }
}