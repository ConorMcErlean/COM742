package Week3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 07/02/2020
*/
public class ComparingNumbers {
    public static Set<Integer> difference (Set<Integer> set1,
                                           Set<Integer> set2){
        // Copy
        Iterator<Integer> iterator = set1.iterator();
        Set<Integer> difference = new HashSet<>();
        while (iterator.hasNext()){
            difference.add(iterator.next());
        }// while

        // Compare
        difference.removeAll(set2);
        return difference;
    }// Difference

    public static void main(String[] arg) {
        // Create & populate sets
        Set<Integer> numbers = new HashSet<>();
        Set<Integer> numbersEven = new HashSet<>();
        Set<Integer> numbersOdd = new HashSet<>();
        numbers.add(1); numbers.add(2); numbers.add(3); numbers.add(4);
        numbers.add(5); numbers.add(6);
        numbersEven.add(2); numbersEven.add(4); numbersEven.add(6);
        numbersEven.add(8); numbersEven.add(10); numbersEven.add(12);
        numbersOdd.add(1); numbersOdd.add(3); numbersOdd.add(5);
        numbersOdd.add(7); numbersOdd.add(9);

        // Calling methods
        System.out.println("Difference between Numbers & NumbersOdd: "
                + difference(numbers, numbersOdd));
        System.out.println("Difference between Numbers & NumbersEven: "
                + difference(numbers, numbersEven));

        int theHatedNumber = 4;
        numbers.remove(theHatedNumber);
        numbersEven.remove(theHatedNumber);
        numbersOdd.remove(theHatedNumber);

        // Call prior method for testing if Subset
        TestingSets.subset(numbers, numbersEven);


    }// main
}// class
