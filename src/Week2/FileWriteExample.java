package Week2;

import java.io.*;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 27/01/2020
*/
public class FileWriteExample {
    public static void main(String[] arg) {
        String s = "A string to write to file";
        try{
            FileWriter fw = new FileWriter("test3.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            //loop through each character
            for (int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                pw.print(c);
            }
            // Print in one go
            pw.println();
            pw.println(s);


            //Closing
            pw.close();
            bw.close();
            fw.close();
        }
        catch (IOException e){
            System.out.println(e);
        }

    }// main
}// class
