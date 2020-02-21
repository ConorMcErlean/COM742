package Week5;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 17/02/2020
Using recursion to create a fibonacci sequence
*/
public class FibonacciSequence {
    private static int[] fibonacci(int[] array, int startingPoint){
        if (startingPoint < 2){
            array[0]= 0;
            array[1]= 1;
            startingPoint = 2;
        }
        if (startingPoint < array.length) {
            array[startingPoint] = (array[startingPoint - 1] +
                    array[startingPoint - 2]);
            fibonacci(array, startingPoint+1);
        }
        return array;
    }
    private static int fibonacci2(int input){
        int fibnumber;
        if (input == 0) {
            fibnumber = 0;
            return fibnumber;
        }
        if (input == 1) {
            fibnumber = 1;
            return fibnumber;
        }
        else{
            fibnumber = fibonacci2(input-1) + fibonacci2( input -2);
        }
        return fibnumber;
    }

    public static void main(String[] arg) {
//        int[] sequence = new int[10];
//        sequence[0] = 0;
//        sequence[1] = 1;
//        sequence = fibonacci(sequence, 0);
//        for (int i = 0; i< sequence.length; i++){
//            System.out.print(sequence[i] + " ");
//        }
        int number = fibonacci2(6);
        System.out.println(number);
    }// main
}// class
