package Week5;

import java.util.Scanner;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 17/02/2020

*/
public class FactorialNumbers {

    private static int getNumber(){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        if (number > 0){
            return number;
        }
        else {
            System.out.print("Sorry, number should be positive. ");
            number = getNumber();
        }
        return number;
    }
    private static int factorial (int number){
        int answer;
        if (number ==0){
            answer = 1;
        }// if
        else {
            answer = number * factorial(number -1 );
        }// else
        return answer;
    }// factorial
    private static int factorialSum(int number){
        int answer;
        if (number ==0){
            answer = 0;
        }// if
        else {
            answer = number + factorialSum(number -1 );
        }// else
        return answer;
    }

    public static void main(String[] arg) {

        System.out.println(factorial(getNumber()));
        System.out.println(factorialSum(getNumber()));

    }// main
}// class
