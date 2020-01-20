package Week1;
/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 20/01/2020
*/
public class Algebra {
    public static void main (String [] args){
        int p, q, r, s, t;
        p = 7;
        q = -4;
        r = (3 * p) + (4 * q);
        s = (5 * p) + (6 * r);
        if (r > s){
            t = p + q + r;
        }
        else {
            t = p + q + s;
        }
        System.out.println("p = " + p);
        System.out.println("q = " + q);
        System.out.println("r = " + r);
        System.out.println("s = " + s);
        System.out.println("t = " + t);
    }
}
