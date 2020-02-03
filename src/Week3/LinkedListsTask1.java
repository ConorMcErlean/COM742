package Week3;

import java.util.LinkedList;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 03/02/2020
*/
public class LinkedListsTask1 {
    public static void main(String[] arg) {
        LinkedList<Integer> numList = new LinkedList<>();
        numList.add(2);
        numList.add(4);
        numList.add(8);
        numList.add(16);
        numList.add(32);
        numList.add(64);
        numList.addLast(128);

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(9);
        numbers.add(12);

        numList.addAll(3, numbers);
        System.out.println(numList);
        System.out.println(numList.get(5));
        numList.set(6, 23);
        System.out.println(numList);
        numList.remove(new Integer(16));


    }// main
}// class
