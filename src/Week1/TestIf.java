package Week1;
/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 20/01/2020
*/
public class TestIf {
    public static void main (String [] arg){
        int a = -4;
        int b, c, d;

        // if a is less than 0 then it is made positive
        if (a<0){
            a = -a;
        }//if

        System.out.println("The value of a = " +a);

        b = 3*a-5;
        c= 4*b-7;

        System.out.println("The value of b before if = " + b);
        System.out.println("The value of c before if = " + c);

        // Compound if else contruct
        if (b> 0 ){
            b = -b + c * 2;
            c = c +1;
        }// if
        else {
            b = b + c *1;
            c = c - 1;
        }
        System.out.println("The value of b after if = " + b);
        System.out.println("The value of c after if = " + c);

    }// main
}// TestIf

