package Bridging_Coursework;
/*
Written by Conor McErlean(mcerlean-c13@ulster.ac.uk) on 06/01/2020
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Coursework {
    public static void main(String[] args) {
        // Read array from file and print
        int[] numbers = readArrayFromFile("practice.txt");

        // Task: Complete main method below
        // Read array from supplied text file (practice.txt) using method provided

        // Sort array using Bubble sort (code provided)
        System.out.print("Bubble sort: ");
        bubbleSort(numbers);

        // Compute the following stats from array obtained from text file
        // Total number of positive values
        System.out.println("Total Positives in Array = " +
                countPositiveValues(numbers));

        // Total number of negative values
        System.out.println("Total Negatives in Array = " +
                countNegativeValues(numbers));

        // Total number of zero values
        System.out.println("Total Zeros in Array = " +
                countZeroValues(numbers));

        // Minimum value (Values are sorted so this is quick)
        System.out.println("Minimum value in Array = "
                + minArrayValue(numbers));

        // Maximum value
        System.out.println("Maximum value in Array = " +
               maxArrayValue(numbers) );

        // Mean, median and mode values
        System.out.println("Mean value in Array = " + meanArrayValue(numbers));
        System.out.println("Median value in Array = " +
                medianArrayValue(numbers));
        System.out.println("Mode value in Array = " + modeArrayValue(numbers));

        // Search for key = 3555318 using Binary search
        int key = 7833106;
        System.out.print("Binary Search: ");
        int location = binarySearch(numbers,key);
        System.out.println("Location of key: " + location);
    }//main

    public static int[] readArrayFromFile(String filename) {
        /*
        Description: Reads an array from file using UUlib.
        Parameters:  filename of textfile.
        Returns: int array of numbers
        */
        int[] array = new int[1];

        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String c = br.readLine();
            Integer size = Integer.parseInt(c);
            array = new int[size];
            System.out.println(array.length);

            for (int i=0; i< size; i++) {

                c = br.readLine();
                array[i] = Integer.parseInt(c);
               // System.out.println(array[i]);
            }
            br.close();
            fr.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        return array;
    }

    public static int countPositiveValues(int[] array) {
        /*
        Description: Counts the positive integer values in an array
        Parameters:  int array to be counted
        Returns: int number of positive values
        */
        int positives = 0;
        // Any number greater than zero is positive
        for(int counter = 0; counter<array.length; counter++)
            if (array[counter] > 0) positives++;
        return positives;
    }// countPositiveValues

    public static int countNegativeValues(int[] array) {
        /*
        Description: Counts the negative integer values in an array
        Parameters:  int array to be counted
        Returns: int number of negative values
        */
        int negatives = 0;
        for(int counter = 0; counter<array.length; counter++){
            // Any number less than zero is negative
            if (array[counter] < 0) negatives++;
        }
        return negatives;
    } // countNegativeValues

    public static int countZeroValues(int[] array) {
        /*
        Description: Counts the zero integer values in an array
        Parameters:  int array to be counted
        Returns: int number of zero values
        */

       int zeros = 0;
        for(int counter = 0; counter<array.length; counter++){

            if (array[counter] == 0) zeros++;
        }
        return zeros;
    }

    public static double meanArrayValue(int[] array) {
        /*
        Description: Computes mean value from an array
        Parameters:  int array of values from which mean is computed
        Returns: double calculated mean value
        */
        // Calculate total sum & total values
        double sum = 0.00, mean;
        int values = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
            values++;
        }
        // Calculate mean
        mean = sum/values;
        return mean;
    }// meanArrayValue

    public static double medianArrayValue(int[] array) {
        /*
        Description: Computes median value from a sorted array
        Parameters:  int array of values from which median is computed
        Returns: double calculated median value
        Note: Array must be sorted!
        */
        double median;
        if (array.length % 2 == 0){
            int midpoint1, midpoint2;
            midpoint1 = array.length/2;
            midpoint2 = midpoint1 -1;
            median = (array[midpoint1] + array [midpoint2]) / 2.00;
        }
        else {
            int midpoint = (array.length / 2);
            median = array[midpoint];
        }
        return median;

    }// median Array Value

    public static int modeArrayValue(int[] array) {
        /*
        Description: Computes the first mode value from a sorted array
        Parameters:  int array of values from which mode is computed
        Returns: int first mode value
        Note: Array must be sorted!
        */

        int modeNumber, modeOccurences, modeContender, count;
        modeContender= modeNumber = array[0];
        count = modeOccurences = 1;
        for (int i = 0; i < array.length; i++){
            if (array[i] == modeContender){
                count++;
                if (count > modeOccurences){
                    // New Mode number
                    modeNumber = modeContender;
                    modeOccurences = count;
                }
            }// if
            else {
                modeContender = array[i];
                count = 1;
            }
        }// for
            return modeNumber;
    }// modeArrayValue

    public static int minArrayValue(int[] array) {
        /*
        Description: Computes minimum value from an int array
        Parameters:  int array of values from which to find minimum
        Returns: int minimum value
        */
        // Sorted array so this is done for you
        return array[0];
    }

    public static int maxArrayValue(int[] array) {
        /*
        Description: Computes maximum value from an int array
        Parameters:  int array of values from which to find maximum
        Returns: int maximum value
        */
        // Sorted Array so this is done for you
        return array[array.length-1];
    }

    public static void swap(int[] array, int posA, int posB) {
        /*
        Description: Swaps two values in an int array
        Parameters:  int array of values and positions of elements to be swapped
        Returns: void
        */
        int tmp = array[posA];
        array[posA] = array[posB];
        array[posB] = tmp;
    }

    public static void bubbleSort(int[] array) {
        /*
        Description: Sorts a int array using bubblesort algoritm
        Parameters:  int array of values to be sorted
        Returns: void
        */
        int ncomps=0, nswaps=0; // declare and initialise counters
        for (int out = array.length-1; out > 0; out--) {
            for (int in = 0; in < out; in++) {
                ncomps++; // increment number of comparisons
                if (array[in] > array[in+1]) {
                    nswaps++;  // increment number of swaps
                    swap(array, in, in+1);
                }
            }
        }
        System.out.println("Comps="+ncomps+" Swaps="+nswaps);
    }// bubbleSort

    public static int binarySearch(int array[], int key) {
        /*
        Description: Performs binary search on an array for a specified value
        Parameters:  int array of values and int key which item to be searched
        Returns: int indicating first location of item, or -1 in case not found
        */

        boolean found = false;
        int bottom = 0, top = array.length-1, middle, location = 0,
                comparisons = 1;

        do {
            middle = (top + bottom)/2;
            if (array[middle] == key){
                found = true;
                location = middle;
            }
            else if (array[middle] < key){
                bottom = middle +1;
                comparisons++;
            }
            else {
                top = middle - 1;
                comparisons++;
            }

        }while(!found && (bottom <= top));

        System.out.println("Comparisons = " + comparisons);
        if (found){
            return location;
        }
        else return -1;

    }// binarySearch



}//class
