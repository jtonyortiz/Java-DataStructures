
//
//Author: James Ortiz
//File: InsertionSort.java
//Compile: javac InsertionSort.java
//
public class InsertionSort {

    public static void insertionSort(int[] list){
        for (int i = 0; i < list.length; i++) {

            //Insert list[i] into sorted sublist list[0...i-1]
            //so that list[0...i] is sorted:

            int currentElement = list[i];
            int k;
            for(k = i - 1; k >= 0 && list[k] > currentElement; k--){
                list[k + 1] = list[k];
            }

            list[k + 1] = currentElement;
        }
    }

    //Driver for InsertionSort:
    public static void main(String[] args) {
        int[] list = { 1, 9, 4, 6, 5, -4};

        InsertionSort.insertionSort(list);

        for(int i: list){
            System.out.print(i + " ");
        }

        System.out.println();
        
    }
}