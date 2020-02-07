package Week3;

import java.util.*;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 07/02/2020
Declare two sets A and B and populate them with the values.
Then iterate through each set to print out each value in turn.
Add 34 to each set, and then find the Union of the sets – print out the answer.
*/
public class SetsOfNumbers {
    public static void main(String[] arg) {
        // Create & populate a sets
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        a.add(24); a.add(26); a.add(28); a.add(30); a.add(32);
        b.add(30); b.add(32); b.add(35); b.add(40); b.add(45); b.add(50);

        // Iterate through and print
        Iterator<Integer> setAIterator = a.iterator();
        Iterator<Integer> setBIterator = b.iterator();
        System.out.println("A:\tB:");
        while (setBIterator.hasNext()){
            if(setAIterator.hasNext()){
            int aNum = setAIterator.next();
            int bNum = setBIterator.next();
            System.out.println(aNum + "\t" + bNum );
            }// if
            else {
                int bNum = setBIterator.next();
                System.out.println("\t" + bNum );
            }// else
        }// while

        // Add 34 to each
        a.add(34);
        b.add(34);
        a.addAll(b);
        System.out.println("Unioned values: " + a);

    }// main
}// class
