package CodingSprint2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 14/02/2020
Created under test conditions
*/
public class CodingSprint2 {
    private static Set<Integer> union (Set<Integer> set1, Set<Integer> set2){
        // Method to return a unioned Set from two component sets.
        Set<Integer> unioned = new HashSet<>();
        unioned.addAll(set1);
        unioned.addAll(set2);
        return unioned;
    }// union

    private static Set<Integer> intersection (Set<Integer> set1,
                                              Set<Integer> set2){
        // Method to return the intersection of two component sets as a new set.
        Set<Integer> intersect = new HashSet<>();
        intersect.addAll(set1);
        intersect.retainAll(set2);
        return intersect;
    }

    private static Set<Integer> difference (Set<Integer> set1,
                                            Set<Integer> set2){
        // Method to return the difference between input set 1 & input set 2
        Set<Integer> diff = new HashSet<>();
        diff.addAll(set1);
        diff.removeAll(set2);
        return diff;
    }

    private static Set<Integer> complement (Set<Integer> set1,
                                            Set<Integer> set2){
        // Method to return the unique values of two sets
        Set<Integer> comp = new HashSet<>();
        comp.addAll(set1);
        comp.addAll(set2);
        comp.removeAll(intersection(set1,set2));
        return comp;
    }
    private static String subset (Set<Integer> set1, Set<Integer> set2){
        // Method to check if set2 is a subset of set1
        if (set1.containsAll(set2)) {
            return "is a subset";
        }// if
        else {
            return "is not a subset";
        }
    }

    private static Set<Integer> multiply (Set<Integer> set1, int number){
        // Method to multiply each value in a set by a number
        Set<Integer> multipliedSet = new HashSet<>();
        Iterator<Integer> iterator = set1.iterator();

        while(iterator.hasNext()){
            int newValue = iterator.next() / number;
            multipliedSet.add(newValue);
        }// while
        return multipliedSet;
    }

    public static void main(String[] arg) {
        // Define sets
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        // Add values to the sets A={2,4,6,8,10}, B={1,2,3,4,5}
//        A.add(2);
//        A.add(4);
//        A.add(8);
//        A.add(6);
//        A.add(10);
//        B.add(1);
//        B.add(2);
//        B.add(3);
//        B.add(4);
//        B.add(5);

        // Test Versions
        A.add(12);
        A.add(24);
        A.add(17);
        A.add(19);
        A.add(21);

        B.add(35);
        B.add(19);
        B.add(20);
        B.add(21);
        B.add(24);
        B.add(25);
        B.add(29);
        B.add(30);





        System.out.println("Set A: " + A);
        System.out.println("Set B: " + B);

        // Call methods for each operation specified in test
        // Union A & B
        Set<Integer> union = union(A, B);
        System.out.println("Unioned Set: " + union);
        // Intersection A & B
        Set<Integer> intersection = intersection(A,B);
        System.out.println("Intersection of sets: " + intersection);
        // Difference A - B
        Set<Integer> difference = difference(A,B);
        System.out.println("Difference between A & B: " + difference);
        // Complement
        Set<Integer> complement = complement(A,B);
        System.out.println("Complement A & B:" + complement);

        // Remove 4 from A & B
//        A.remove("4");
//        B.remove(4);

        // Empty Set A
//        A.clear();

        // Check if B is subset of A
        System.out.println("B " + subset(A,B) + " of A.");

        // Check if B is empty
        if (B.isEmpty()){
            System.out.println("B is empty");
        }
        else{ System.out.println("B is not empty");}

        // Multiply a set by 3
        Set<Integer> multiplied = multiply(A, 5);
        System.out.println("Multiplied set: " + multiplied);

        // After changes print
        System.out.println("Set A: " + A);
        System.out.println("Set B: " + B);

    }// main

}// class
