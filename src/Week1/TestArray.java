package Week1;
/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 20/01/2020
*/

public class TestArray {
    public static void fillArray(int[] array){
        for (int counter = 0; counter < array.length; counter++ ){
            array[counter] = counter *10;
        }// for
    }// fillArray

    public static void printArray(int[] array) {
        for (int counter = 0; counter < array.length; counter++ ){
            System.out.println("Numbers[" + counter + "] = "
                    + array[counter]);
        }// for
    }// print array

    public static double arrayAverage(int[] array){
        int total = 0;
        for (int counter = 0; counter < array.length; counter++ ){
            total += array[counter];
        }// for
        return (double) total / array.length;
    }// arrayAverage

    public static void main(String[] arg) {
        // Integer Array of 20 values
        int [] numbers = new int[20];

        // Fill it up
        fillArray(numbers);
        // Print elements
        printArray(numbers);
        // Calculate the Average
        double average = arrayAverage(numbers);
        System.out.println("Average is " + average);

    }// main
}// class
