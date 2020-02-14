package Utilities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 10/02/2020
For class we need files of a specific length made up of random numbers,
this program makes generating those files easy.
*/
public class NumberFileGenerator {

    public static void writeNumbers(int howMany, String filename){
        // Method not necessary for functioning program, but making generating a
        // set of numbers alot easier
        try{
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            //loop through each character
            for (int i = 0; i <howMany; i++){
                int number = (int) (Math.random() * 100) +1;
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
    public static void main(String[] arg) {
        // In the below segment and call, change the filename and filesize to
        // the required values and run.
        String filename = "example.txt";
        int filesize = 50;
        writeNumbers(filesize, filename);
    }// main
}// class
