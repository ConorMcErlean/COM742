package Week3;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 03/02/2020
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Pratical {

    public static void writeNumbers(int howMany, String filename){
        try{
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            //loop through each character
            for (int i = 0; i <howMany; i++){
                int number = (int) (Math.random() * 100);
                pw.println(number);
            }
            //Closing
            pw.close();
            bw.close();
            fw.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    public static void readNumbers(String filename, LinkedList<Integer> list){
        try{
            // Two Classes required for file read
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            // Read line and convert to int
            String c = br.readLine();
            int num;

            // Loop through as many times as required
            while (c != null){
                num = Integer.parseInt(c);
                list.add(num);
                c=br.readLine();
            }
            br.close();
            fr.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    public static int[] readNumbers(String filename, int[] array ){
        try{
            // Two Classes required for file read
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            // Read line and convert to int
            String c = br.readLine();
            final int ARRAY_LENGTH = 20;
            array = new int[ARRAY_LENGTH];
            int index = 0;
            int num;

            // Loop through as many times as required
            while (c != null){
                num = Integer.parseInt(c);
                array[index] = num;
                index++;
                c=br.readLine();
            }
            br.close();
            fr.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
        return array;
    }
    public static void findOccurences(int first, int last,
                                      LinkedList<Integer> list){
        // Find occurence
        if (list.contains(first)){
            System.out.println("First location of " + first + " is: "
                    + list.indexOf(first));
        }
        else{
            System.out.println("Element " + first + " doesn't exist");
        }
        if (list.contains(last)){
            System.out.println("Last location of " + last + " is: " +
                    list.lastIndexOf(last));
        }
        else {
            System.out.println("Element " + last + " doesn't exist");
        }
    }
    public static void listPosition(LinkedList<Integer> list){
        int index = 0;
        Iterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()){

            System.out.print("Index " + index + " value: " + iterator.next()
                    + "\n");
            index++;
        }// while
    }
    public static void main(String[] arg) {
//        writeNumbers(20);

        LinkedList<Integer> listNum = new LinkedList<>();
//        readNumbers("File1.txt", listNum);
////        listNum.addFirst(16);
////        listNum.addLast(24);
////        findOccurences(6,15, listNum);
////        listPosition(listNum);
////
////        // Remove first, last & index 4
////        listNum.removeFirst();
////        listNum.removeLast();
////        listNum.remove(4);
////
////        // Swaps elements 3 and 16
////        Collections.swap(listNum, 3, 16);
////
////        // Second list of 6 elements
////        LinkedList<Integer> secondList = new LinkedList<>();
////        for (i =0; i< 6; i++){
////            Integer num= (int)(Math.random()*100);
////            secondList.add(num);
////        }
////        listNum.addAll(secondList);
////
////        // Check if 32 exists
////        if (listNum.contains(32)){
////            System.out.println("32 does exist");
////        }
////        else{
////            System.out.println("32 does not exist");
////        }
////        if (listNum.isEmpty()){
////            System.out.println("List is empty");
////        }

        // Use a new file
        writeNumbers(20, "File2.txt");
        int[] arrayNum = new int[20];
        arrayNum = readNumbers("File2.txt", arrayNum);
        readNumbers("File2.txt", listNum);
        for (int i = 0; i< arrayNum.length; i++){
            System.out.print(arrayNum[i] + ", ");
        }
        System.out.println();
        System.out.println(listNum);


        // Add value 20 to position 10
        listNum.add(10, 20);
        arrayNum[10]= 20;

        for (int i = 0; i < arrayNum.length; i++){
            System.out.print(arrayNum[i] + ", ");
        }
        System.out.println();
        System.out.println(listNum);





//        // Print
//        System.out.println(listNum);

    }// main
}// class
