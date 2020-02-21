package Week5;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 17/02/2020

A program for class use demonstrating a recursive method.
*/
public class Flowers_RecursionExample {

    private static void emptyVase(int flowersInVase){
        if(flowersInVase > 0 ) {
            // take one flower &
            System.out.println("We picked a flower");
            emptyVase(flowersInVase -1);
        }// if
        else {
            // Vase is empty nothing needs done
            System.out.println("All gone!");
        }

    }// emptyVase

    public static void main(String[] arg) {
        int bigVase = 6;
        emptyVase(bigVase);
    }// main
}// class
