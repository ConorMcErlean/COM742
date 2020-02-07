package Week3;

import java.util.HashSet;
import java.util.Set;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 07/02/2020
*/
public class ArraysToSets {
    public static void main(String[] arg) {
        Integer[] numbers = {77, 23, 4, 66, 99, 112, 45, 56, 39, 89};
        Set<Integer> multipliedNumbers = new HashSet<>();
        Set<Integer> numbersSet = new HashSet<>();
        for (int index = 0; index< numbers.length; index++){
            numbersSet.add(numbers[index]);
        }
        for (int index = 0; index< numbers.length; index++){
            multipliedNumbers.add(numbers[index]*3);
        }
        System.out.println("Numbers: " + numbersSet);
        System.out.println("Multipled: " + multipliedNumbers);
    }// main
}// class
