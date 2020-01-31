package Week2;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 31/01/2020
*/
public class InsertionSort {
    public static void insertionSort(int[] data){
        int in, out, temp;
        // Outer loop, one loop = 1 pass of the data
        for (out = 1; out< data.length; out++){

            // Taking a copy
            temp = data[out];
            // Inner loop moves down through values comparing the copy
            for (in= out; in> 0 && data[in-1] >= temp; in --){
                data[in] = data [in-1];
            }
            data[in] = temp;
            BubbleSort.arrayToString(data);
        }

    }

}// class
