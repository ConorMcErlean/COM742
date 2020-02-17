package Week5;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 17/02/2020
Here is a recursive formula of the sequence 3,5,7,...
a(1)=3           ←the first term is 3
a(n)=a(n-1)+2    ←add 2 to the previous term
Write a recursive method for this formula and print out the sequence of numbers
for a(30)

*/
public class RecursiveFormula {

    private static int secondRecursiveFormula(int input){
        int number;
        if (input == 1) {
            System.out.print(5 + " ");
            return 5;
        }
        else{
            number = (secondRecursiveFormula(input-1) +3);
        }
        System.out.print(number + " ");
        return number;
    }

    private static int recursiveFormula(int input){
        int number;
        if (input == 1) {
            System.out.print(3 + " ");
            return 3;
        }
        else{
            number = (recursiveFormula(input-1) +2);
        }
        System.out.print(number + " ");
        return number;
    }
    public static void main(String[] arg) {
       secondRecursiveFormula(50);
    }// main
}// class
