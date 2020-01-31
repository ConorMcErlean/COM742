package Week2;

import java.sql.SQLOutput;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 31/01/2020
*/
public class BubbleSort {
    public static void arrayToString(int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }// Array to String

    public static void bubbleSort(int[] data){
        int passes = 0, swaps = 0;
        // Outer loop of sort, number of passes is n-1
        for (int pass = data.length-1; pass> 0; pass--){
            passes++;
            // Inner loop with comparison & swap
            for (int inner = 0; inner < pass; inner++){
                // Comparison
                if (data[inner] > data[inner+1]){
                    // Swap
                    swaps++;
                    int temp = data[inner];
                    data[inner] = data [inner+1];
                    data [inner +1] = temp;
                }// Comparison
            }// Inner Loop
        }// Outer loop
        System.out.println("Swaps: " + swaps + ". \t Passes: " + passes + ".");
    }

    public static void main(String[] arg) {
        int[] numbers = { 12, 34,23,56, 78, 98, 1, 87, 76, 45};
        int[] numbers2 = numbers.clone();
        int[] numbers3 = numbers.clone();
        int[] numbers4 = {1, 23, 54, 78, 7, 12, 89, 56, 33, 4};
//
//        System.out.println("Bubbles Sort");
//        arrayToString(numbers);
//        bubbleSort(numbers);
//        arrayToString(numbers);
//
//        System.out.println("Selection Sort");
//        arrayToString(numbers2);
//        SelectionSort.selectionSort(numbers2);
//        arrayToString(numbers2);

        System.out.println("Insertion Sort");
        arrayToString(numbers4);
        InsertionSort.insertionSort(numbers4);

    }// main
}// class
