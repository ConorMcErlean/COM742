package Week2;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 31/01/2020
*/
public class SortLab {

    static int[] numbers = {2, 5, 9, 3, 13, 1, 16, 7, 8, 15, 4, 6};

    public static void swap (int[] array, int a, int b){
        // Swaps two elements in array positions
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }//Swap

    public static void bubbleSort(int count){
        //Bubble sort using swap method only sorts numbers
        int comparisons = 0, swaps = 0;
        boolean swapped = false;

        // Outer layer, number of passes will be limited to count
        int out = count - 1;
        do {

                swapped = false;
                // Inner loop with comparison and Swap call
                for (int inner = 0; inner < out; inner++) {
                    comparisons++;
                    // Comparison
                    if (numbers[inner] > numbers[inner + 1]) {
                        // Call to Swap
                        swapped = true;
                        swaps++;
                        swap(numbers, inner, inner + 1);
                    }// If / Comparison
                }// Inner Loop
                out--;
             // Outer loop
        }while(swapped && out > 0);
        System.out.println("Comparisons: " + comparisons + " Swaps: " + swaps);

    }// BubbleSort

    public static int[] readNumbers(String filename){
        int[] array = new int[1];
        try {
            // Objects
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            // Read and convert to int
            String lineread = br.readLine();
            int num, index = 0;
            // Create array
            num = Integer.parseInt(lineread);
            array = new int[num];
            // Loop
            for (int i=0; i < array.length; i++) {
                lineread = br.readLine();
                array[i] = Integer.parseInt(lineread);
            }
            br.close();
            fr.close();
        }//try
        catch (IOException e){
            System.out.println(e);
        }//catch
        return array;
    }// Read Numbers

    public static void main(String[] arg) {
    numbers = readNumbers("File1.txt");
    bubbleSort(10);
    BubbleSort.arrayToString(numbers);

    }// main
}// class
