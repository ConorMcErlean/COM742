package Week4;

import java.util.Random;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 14/02/2020
*/
public class MinMax2DArray {

    public static int array2DMax(int[][] a) {
        int max = a[0][0];
        for (int out = 0; out < a.length; out++){
            for (int in = 0; in< a[out].length; in++ ){
                if (a [out][in] > max){
                    max = a[out][in];
                }// if
            }// Inner for
        }// Outer for
        return max;
    }//array2DMax

    public static int array2DMin(int[][] a) {
        int min = a[0][0];
        for (int out = 0; out < a.length; out++){
            for (int in = 0; in< a[out].length; in++ ){
                if (a [out][in] < min){
                    min = a[out][in];
                }// if
            }// Inner for
        }// Outer for
        return min;
    }//array2DMax

    public static int rowSum(int[][] a, int x)  {
        int sum = 0;
        for (int col = 0; col < a[x].length; col++){
            sum += a[x][col];
        }// for
        return sum;
    }
    public static int colSum(int[][] a, int x)  {
        int sum = 0;
        for (int col = 0; col < a.length; col++){
            sum += a[col][x];
        }// for
        return sum;
    }



    public static void main(String[] arg) {
        Random ran = new Random(0); // Create random num generator object - seed=0
        int [][]a = new int[20][8]; //20 rows, 8 cols

        for(int r = 0; r < a.length; r++){
            for(int c = 0; c < a[0].length; c++) { // nested for loop to go over 2d array
                a[r][c] = ran.nextInt(1000) + 1; // generate random num
                System.out.print(a[r][c] + "\t"); // tab between columns for print
            }
            System.out.println(""); // new line between rows for print
        }
        System.out.println("Row 1 sum = " + rowSum(a,1));
        System.out.println("Col 2 sum = " + colSum(a,2));

    }// main
}// class
