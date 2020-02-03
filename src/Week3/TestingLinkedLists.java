package Week3;

import sun.rmi.runtime.Log;

import java.util.LinkedList;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 03/02/2020
*/
public class TestingLinkedLists {
    public static void main(String[] arg) {
        LinkedList<Number> linkedNumbers = new LinkedList<>();
        linkedNumbers.add(new Integer(13));
        linkedNumbers.add(new Float(3.31));
        linkedNumbers.add(new Double(299.988));
        linkedNumbers.add(new Long(67000));


        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(32);
        list2.add(34);
        list2.add(67);

        linkedNumbers.addAll(2, list2);

        // Print
        System.out.println(linkedNumbers);
    }// main
}// class
