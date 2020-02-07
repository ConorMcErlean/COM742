package Week3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 07/02/2020
Declare two sets Months1 and Months2 and populate them with the strings above.
Determine the Union and Intersection of the sets – print out the answer for
each.  Remove May and June from set Months1 and determine the Union and
Intersection of the new sets.  Write code to check to see if the intersection
is an empty set and determine the size of the resulting Union set.
*/
public class SetsOfMonths {
    private static Set<String> union(Set<String> set1, Set<String> set2){
        // Copies, unions & returns two sets of strings
        // Cloning Set for following tasks
        Iterator<String> iterator = set1.iterator();
        Set<String> union = new HashSet<>();
        while (iterator.hasNext()) {
            String month = iterator.next();
            union.add(month);
        }// while
        union.addAll(set2);

        // Print size of union
        System.out.println("Size of Union: " + union.size());
        return union;
    }//union
    private static Set<String> intersection(Set<String> set1, Set<String> set2){
        // Copies, intersects & returns two sets of strings
        // Cloning Set for following tasks
        Iterator<String> iterator = set1.iterator();
        Set<String> intersect = new HashSet<>();
        while (iterator.hasNext()) {
            String month = iterator.next();
            intersect.add(month);
        }// while
        intersect.retainAll(set2);
        if (intersect.isEmpty()){
            System.out.println(" Intersection set is empty");
        }

        return intersect;
    }// intersection

    public static void main(String[] arg) {
        // Define
        Set<String> Months1 = new HashSet<>();
        Set<String> Months2 = new HashSet<>();
        // Populate
        Months1.add("Jan");
        Months1.add("Feb");
        Months1.add("March");
        Months1.add("April");
        Months1.add("May");
        Months1.add("June");
        Months2.add("May");
        Months2.add("June");
        Months2.add("July");
        Months2.add("August");

        Set<String> UnionedMonths = union(Months1, Months2);
        Set<String> IntersectionMonths = intersection(Months1, Months2);
        System.out.println(Months1 + "\n" + Months2);
        System.out.println("Unioned: " + UnionedMonths + "\nIntersection: " +
                IntersectionMonths);
        // Remove & Compare
        Months1.remove("May");
        Months1.remove("June");

        UnionedMonths = union(Months1, Months2);
        IntersectionMonths = intersection(Months1, Months2);
        System.out.println(Months1 + "\n" + Months2);
        System.out.println("Unioned: " + UnionedMonths + "\nIntersection: " +
                IntersectionMonths);

    }// main
}// class
