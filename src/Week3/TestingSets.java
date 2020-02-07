package Week3;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Union;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 07/02/2020

*/
public class TestingSets {
    public static void subset(Set<Integer> set1, Set<Integer> set2){
        // Method to check if set 1 is a subset of set 2
        if (set1.containsAll(set2)){
            System.out.println("B is a subset of A");
        }
        else{
            System.out.println("B is not a subset of A");
        }
    }// Subset

    public static Set<Integer> union (Set<Integer> set1, Set<Integer> set2){
        // Method to Union, Print and return to sets.
        // First copy Set1
        Iterator<Integer> iterator = set1.iterator();
        Set<Integer> union = new HashSet<>();
        while (iterator.hasNext()){
            union.add(iterator.next());
        }// while
        // Now union
        union.addAll(set2);
        // Print
        System.out.println("Result of union: " + union);
        // Return
        return union;
    }// union

    public static Set<Integer> intersection (Set<Integer> set1,
                                             Set<Integer> set2){
        // Method to find intersection, Print and return to sets.
        // First copy Set1
        Iterator<Integer> iterator = set1.iterator();
        Set<Integer> intersection = new HashSet<>();
        while (iterator.hasNext()){
            intersection.add(iterator.next());
        }// while
        // Now find intersection
        intersection.retainAll(set2);
        // Print
        if (intersection.isEmpty()) {
            System.out.println("There is no intersection between the two " +
                    "sets.");
        }
        else{
            System.out.println("Result of intersection: " + intersection);
        }
        // Return
        return intersection;
    }// Intersection
    public static void main(String[] arg) {
        // Creating two sets
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        // Populating sets
        a.add(20); a.add(30); a.add(40); a.add(50);
        b.add(60); b.add(61); b.add(62); b.add(63); b.add(64); b.add(65);

        // Using Methods
        subset(a, b);
        Set<Integer> unionedSet = union(a,b);
        Set<Integer> intersectionOfSets = intersection(a,b);

        // Printing all end sets
        System.out.println("Set A: \t" + a);
        System.out.println("Set B: \t" + b);
        System.out.println("Union: \t" + unionedSet);
        System.out.println("Intersection: " + intersectionOfSets );
    }// main
}// class
