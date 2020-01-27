package Week2;

import java.io.*;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 27/01/2020
*/
public class ReadingIntegers {
    public static void main(String[] arg) {
        int total = 0;
        try{
            // Two Classes required for file read
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);


            // Read line and convert to int
            String c = br.readLine();
            int num;

            // Loop through as many times as required
            while (c != null){
                num = Integer.parseInt(c);
                total += num;
                c = br.readLine();
            }
            br.close();
            fr.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Total: " + total);
        }
    }// main
}// class
