package Week2;

import java.io.BufferedReader;
import java.io.*;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 27/01/2020
*/
public class TestFiles {
    // return total value of numbers in specified file
    public static int countTotalPositiveValue(String fileName) {
        // open file
        // declare local variables to count positive integers
        int positives = 0;
        // and to store number read from file
        int number;
        try {
            // Two Classes required for file read
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String lineRead = br.readLine();
            // loop until end of file
            while ( lineRead != null){
                number = Integer.parseInt(lineRead);
                //   if number read from file is positive add it to count
                if (number > 0){
                    positives++;
                }// if
                lineRead = br.readLine();
            }// end of loop

            // close file
            br.close();
            fr.close();
        }
        catch (IOException  e){
            System.out.println(e);
        }
        // return count
        return positives;
    }// countTotalPositives


    // write array data elements to specified file
    public static void writeToFile(int[] data, String fileName) {
        try {
            // open file
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            // loop through each array position
            for (int index = 0; index < data.length; index++){
                //   write array value to file (separate each item written
                //   with either a space a tab or a new line)
                pw.println(data[index]);
            } // end of loop

            // close file
            pw.close();
            bw.close();
            fw.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
        // return total value of numbers in specified file
    }// WriteToFile

    // Overloaded Method
    public static void writeToFile(String[] data, String fileName) {
        try {
            // open file

            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (int index = 0; index < data.length; index++){
                //   write array value to file (separate each item written
                //   with either a space a tab or a new line)
                pw.println(data[index]);
            } // end of loop

            // close file
            pw.close();
            bw.close();
            fw.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }// WriteToFile



    public static void main(String[] arg) {
        int[] numbers = {12, 24, 45, 56, 78};
        String[] words = {"Cat", "Dog", "Fish"};
        System.out.println("Positives: " +
                countTotalPositiveValue("test.txt"));
        writeToFile(numbers, "test2.txt");
        writeToFile(words, "test3.txt");

    }// main
}// class
