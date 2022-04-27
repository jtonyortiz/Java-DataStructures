import java.util.Arrays;
import java.util.Comparator;

public class SortStringByLength {
    public static void main(String[] args) {
        String[] cities = {"Atlanta", "Savannah", "New York", "Dallas"};
        Arrays.sort(cities, new MyComparator());
     
        for(String s: cities){
            System.out.print(s + " ");
        }
        
    }
}
