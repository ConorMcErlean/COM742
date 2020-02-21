package Week5;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 21/02/2020
*/
public class ArraySum {

    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int total = sumArray(numbers);
        int[] shifted = shiftArray(numbers);
        System.out.println(total);
        printArray(numbers);
        printArray(shifted);
    }

    public static int sumArray(int[] inArray) {
        //write a method to sum the values in an array
        int total = 0;
        for (int i = 0; i < inArray.length; i++){
            total += inArray[i];
        }
        return total;
    }

    public static int[] shiftArray(int[] inArray) {
        int[] newArray = new int[inArray.length+1];
        //write a method to carry out a simple manipulation of an array,
        // shift all numbers to the right insert -1 in first location
        newArray[0] = -1;
        for (int i = 0; i<inArray.length; i++){
            newArray[i+1] = inArray[i];
        }
        return newArray;
    }

    public static void printArray(int[] inArray) {
        //print out the values in the array
        for (int i = 0; i< inArray.length; i++){
            System.out.print( inArray[i] + " ");
        }
    }


}// class
