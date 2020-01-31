package Week2;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 31/01/2020
*/
public class SelectionSort {
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
    public static void main(String[] arg) {
    }// main
}// class
