package Week3;

import sun.awt.image.ImageWatched;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 03/02/2020
*/
public class LinkedListsTask2 {
    public static void main(String[] arg) {
        LinkedList<String> StrList = new LinkedList<>();
        StrList.add("Mary");
        StrList.add("John");
        StrList.add("Peter");
        StrList.add("Shane");
        StrList.add("Seamus");
        StrList.add("James");
        System.out.println(StrList);
        List<String> subList = StrList.subList(1,4);
        System.out.println(subList);
        Collections.reverse(StrList);
        System.out.println(StrList);
        Collections.sort(StrList);
        System.out.println(StrList);
        LinkedList<String> CopyStrList = new LinkedList<>();
        CopyStrList.add(" ");
        CopyStrList.add(" ");
        CopyStrList.add(" ");
        CopyStrList.add(" ");
        CopyStrList.add(" ");
        CopyStrList.add(" ");
        Collections.copy(CopyStrList, StrList);
        Collections.shuffle(CopyStrList);
        System.out.println(CopyStrList);
        if (CopyStrList.contains("Shane")){
            int index = CopyStrList.indexOf("Shane");
            System.out.println("Index: " + index);
        }

    }// main
}// class
