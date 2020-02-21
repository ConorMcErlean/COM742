package Week5;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 17/02/2020
*/
public class WriteNumbers_RecursionExample {
    private static void writeNumbers (int aNumber){
        System.out.println(aNumber);
        if (aNumber > 0){
            writeNumbers(aNumber -1);
        }
        else {
            return;
        }
    }

    public static void main(String[] arg) {
        writeNumbers( 99);
    }// main
}// class
