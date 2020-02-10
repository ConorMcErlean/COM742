package Week4;

import java.util.Random;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 10/02/2020
*/
public class ArrayAnalysis {
    private static int[][] create2d (){
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i ++){
            for (int j = 0; j < array[i].length; j++){
                Random random = new Random();
                array[i][j] = random.nextInt(100)+1;
            }
        }
        return array;
    }//create2d
    public static void main(String[] arg) {
        int[][] numbers = create2d();
    }// main
}// class
