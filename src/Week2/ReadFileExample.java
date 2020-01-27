package Week2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 27/01/2020
*/
public class ReadFileExample {
    public static void main(String[] arg) {
        try{
            FileReader fr = new FileReader("test2.txt");
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();

            while (s != null){
                System.out.println(s);
                s = br.readLine();
            }
            br.close();
            fr.close();

        }
        catch (IOException e){
            System.out.println(e);
        }


    }// main
}// class
