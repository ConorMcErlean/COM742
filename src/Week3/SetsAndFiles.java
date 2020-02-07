package Week3;

import java.io.*;
import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 07/02/2020
*/
public class SetsAndFiles {
    public static void writeNumbers(int howMany, String filename){
        // Method not necessary for functioning program, but making generating a
        // set of numbers alot easier
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


    public static Set<Integer> readFileToSet(String filename){
        // Reads a .txt file and returns numbers as a set
        // Defining local set
        Set<Integer> readSet = new HashSet<>();
        // File Read
        try{
            // Creating FileRead Objects
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            // Reading First Line
            String line = br.readLine();
            // Loop
            while (line != null){
                // Convert to Integer
                Integer number = Integer.parseInt(line);
                // Add to Set
                readSet.add(number);
                // Read next Line
                line = br.readLine();
            }// while
            // Closing FileRead Objects
            br.close();
            fr.close();
        }// try
        catch (IOException e){
            System.out.println(e);
        }// catch
        return readSet;
    }// ReadFileToSet
    public static void main(String[] arg) {
        // Call read file methods
        Set<Integer> set1 = readFileToSet("Set1.txt");
        Set<Integer> set2 = readFileToSet("Set2.txt");
        // Print
        System.out.println(set1);
        System.out.println(set2);

        // Find Union & Intersection
        Set<Integer> UnionSet = union(set1, set2);
        Set<Integer> IntersectionSet = intersection(set1, set2);

        // Check if union contains 10
        if (UnionSet.contains(10)){
            System.out.println("Union does contain 10");
        }
        else{
            System.out.println("Union does not contain 10");
        }

    }// main
}// class
