package Week1;
/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 20/01/2020
*/
import java.util.Scanner;

public class Coins {
    public static void main (String [] arg){
        //Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        int coinValue;

        //User input
        System.out.print("Please enter an integer value: ");
        coinValue = input.nextInt();

        switch (coinValue){
            case 1:
                System.out.println("One Penny");
                break;
            case 2:
                System.out.println("Two Pence");
                break;
            case 5:
                System.out.println("Five Pence");
                break;
            case 10:
                System.out.println("Ten Pence");
                break;
            case 20:
                System.out.println("Twenty Pence");
                break;
            case 50:
                System.out.println("Fifty Pence");
                break;
            case 100:
                System.out.println("One Pound");
                break;
            case 200:
                System.out.println("Two Pounds");
                break;

                default:
                    System.out.println("Invalid coin value: " + coinValue);
                    break;

        }

    }

}
