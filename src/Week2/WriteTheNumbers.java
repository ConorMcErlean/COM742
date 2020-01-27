package Week2;

import java.io.*;


/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 27/01/2020
*/
public class WriteTheNumbers {

    public static void writeNumbers(String filename, int number){
        try {
            // Create the file and Initialise
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            // Loop
            for (int counter = 0; counter <= number; counter ++){
                pw.println(counter);
            }

            // Close
            pw.close();
            bw.close();
            fw.close();

        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    public static void main(String[] arg) {
        writeNumbers("thirty.txt", 30);
    }// main
}// class
