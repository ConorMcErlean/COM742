package Week1;
/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 20/01/2020
*/
import java.util.Scanner;

public class Alphabet {
    public static void main(String [] arg){
        char letter;
        System.out.println("Enter a letter:");
        Scanner input = new Scanner(System.in);
        letter = input.nextLine().toLowerCase().charAt(0);

        switch (letter){
            case 'a':
                System.out.println("Letter is a vowel");
                break;
            case 'e':
                System.out.println("Letter is a vowel");
                break;
            case 'i':
                System.out.println("Letter is a vowel");
                break;
            case 'o':
                System.out.println("Letter is a vowel");
                break;
            case 'u':
                System.out.println("Letter is a vowel");
                break;
            default:
                System.out.println("Letter is a consonant");
                break;
        }


    }//main
}//class
