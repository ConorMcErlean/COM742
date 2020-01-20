package Week1;
/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 20/01/2020
*/
public class Arrays {
    public static void printArray(double[] array){
        for (int counter = 0; counter < array.length; counter++){
            System.out.println(array[counter]);
        }
    }//printArray

    public static void multiplyArray(double[] array, double multiplyBy){
        for (int counter = 0; counter < array.length; counter++){
            array[counter] *= multiplyBy;
        }
    }//multiplyArray

    public static double[] reverseArray(double[] array){
        double[] newArray = new double[array.length];
        int newArrayPosition = 0;
        for (int counter = array.length-1; counter >= 0; counter--){
            // Take old value and place in new array, then increment the counter for new array
            newArray[newArrayPosition] = array[counter];
            newArrayPosition++;
        }
        return newArray;
    }

    public static void main (String [] arg){
        char[] letters = new char[10];
        double[] numbers = {3.3, 9.0, 45.0, 6.5, 7.0};
        numbers = reverseArray(numbers);
        //multiplyArray(numbers, 2);
        printArray(numbers);

    }//main
}//class
