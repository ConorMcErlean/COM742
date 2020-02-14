package Week4;

import java.io.*;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 10/02/2020
A program written for algorithm analysis
*/
public class MaxAndMin {
    static int steps;
    private static int[] readfile(){
        // Local Variables
        final String FILENAME = "Analysis.txt";
        final int FILELENGTH = 20;
        int[] array = new int[FILELENGTH];

        try{
            // Read objects
            FileReader file = new FileReader(FILENAME);
            BufferedReader readline = new BufferedReader(file);

            // First line read
            String line = readline.readLine();
            int index = 0;

            // Loop
            while (line != null){
                Integer number = Integer.parseInt(line);
                array[index] = number;
                index++;
                line = readline.readLine();
            }// while

            // Close Read objects
            readline.close();
            file.close();

        }// try
        catch (IOException e) {
            System.out.println(e);
        }//catch

        finally {
            return array;
        }
    }// ReadFile
    private static int findMin(int[] array){
        steps = 0;
        int min = array[0];
        steps++;
        for (int i = 1; i < array.length; i++){
            steps++;
            if (array[i] < min){
                min = array[i];
                steps += 2;
            }// if
            else{ steps++;}
        }// for
        System.out.println("Steps: " + steps);
        return min;
    }
    private static int findMax(int[] array){
        steps = 0;
        int max = array[0];
        steps ++;
        for (int i = 1; i < array.length; i++){
            steps++;
            if (array[i]> max){
                max = array[i];
                steps += 2;
            }// if
            else{ steps++;}
        }// for
        System.out.println("Steps: " + steps);
        return max;
    }
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
    public static void insertionSort(int[] data) {
        int in, out, temp;
        // Outer loop, one loop = 1 pass of the data
        for (out = 1; out < data.length; out++) {

            // Taking a copy
            temp = data[out];
            // Inner loop moves down through values comparing the copy
            for (in = out; in > 0 && data[in - 1] >= temp; in--) {
                data[in] = data[in - 1];
            }
            data[in] = temp;
        }
    }
    public static void selectionSort(int[] data){
        int in, out, min, passes = 0, swaps = 0;
        // Outer loop. passes = n-1
        for (out = 0; out < data.length - 1; out++){
            passes++;

            min = out;
            // Inner loop checking for smallest value
            for (in = out +1; in < data.length; in ++){
                System.out.println("Checking if " + data[in] + " is smaller " +
                        "than " +data[min] );
                // Setting location of smallest vale
                if (data[in] < data[min]){
                    System.out.println("It was, new minimum.");
                    min = in;
                } // if
            }// Inner loop
            // Swap
            System.out.println("Swapping " + data[min] + " to index " + out +
                    " by swapping with the value " + data[out]);
            swaps++;
            int temp  = data[out];
            data[out] = data [min];
            data[min] = temp;
        }// Outer loop
        System.out.println("Swaps: " + swaps + ". \t Passes: " + passes + ".");
    }// SelectionSort
    private static void duplicates(int[] data){
        boolean duplicateFound = false;
        steps = 2;
        // outer loop
        for (int out= 0; out < data.length && !duplicateFound; out++){
            steps +=2;
            // inner loop
            for (int in= 0; in< data.length; in++ ){
                steps +=2;
                // don't check same index
                if (out != in){
                    if (data[out] == data[in]){
                        duplicateFound = true;
                        steps +=3;
                    }// if
                    else{steps++;}
                }// if
            }// for
        }//for
        if (duplicateFound) {
            System.out.println("Duplicate found");
            steps +=2;
        }
        else {
            System.out.println("No duplicate found");
            steps +=2;
        }
        System.out.println("Steps: " + steps);
    }// duplicates
    public static void main(String[] arg) {
        int[] numbers = readfile();
        System.out.println(findMax(numbers));
        System.out.println(findMin(numbers));
        bubbleSort(numbers);
        duplicates(numbers);

    }// main
}// class
