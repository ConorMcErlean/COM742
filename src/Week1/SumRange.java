package Week1;

import java.util.Scanner;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 20/01/2020
Adds together all the numbers between start and end, eg. 1 + 2 + 3 + 4...
*/
public class SumRange {

    public static int sumRange(int start, int end){
        int s, e;
        if (start < end){
            s = start;
            e = end;
        }// if
        else{
            s = end;
            e = start;
        }//else
        int n = e - s + 1;
        int sum = (n * (s + e)) / 2;
        return sum;
    }// sumRange
    public static void main(String[] arg) {
        // Variables and objects
        char again;
        Scanner input = new Scanner(System.in);
        int number1, number2, answer;

        do{
            // User Prompt
            System.out.println("Enter two numbers:");
            System.out.print("\t number 1: ");
            number1 = input.nextInt();
            System.out.print("\t number 2: ");
            number2 = input.nextInt();
            // Line below empties buffer of Enter characters
            input.nextLine();

            // Call SumRange
            answer = sumRange(number1, number2);

            // Print
            System.out.println("Answer is " + answer);

            // Repeat or not
            System.out.print("Would you like to run again? (Y or N): ");
            again = input.nextLine().toLowerCase().charAt(0);

        }while (again != 'n');
    }// main
}// class
