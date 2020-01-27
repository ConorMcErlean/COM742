package Week2;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.*;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 27/01/2020
*/
public class StockReport {
    public static String readFromConsole(String filetype){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the location of the " + filetype
                + "file:");
        String response = sc.nextLine();
        return response;
    }


    public static void main(String[] arg) {
        String stockFile, quantityFile, itemFile, outputFile;
        // read file names from console
        stockFile = readFromConsole("stock");
        quantityFile = readFromConsole("quantity");
        itemFile = readFromConsole("item");
        outputFile = readFromConsole("output");

        // open files
        try{
            // Stock
            FileReader stockFileRead = new FileReader(stockFile);
            BufferedReader stockReader = new BufferedReader(stockFileRead);
            // Quantity
            FileReader quantityFileRead = new FileReader(quantityFile);
            BufferedReader quantityReader = new BufferedReader(quantityFileRead);
            // Item
            FileReader itemFileRead = new FileReader(itemFile);
            BufferedReader itemReader = new BufferedReader(itemFileRead);
            // Print
            FileWriter fw = new FileWriter(outputFile);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);


            // loop while not end of input file
            String stock = stockReader.readLine();
            pw.println("StockCode:\tValue:");
            while (stock != null){
                //     read stock record fields
                String quantityText = quantityReader.readLine();
                int quantity = Integer.parseInt(quantityText);

                String itemText = itemReader.readLine();
                double item = Double.parseDouble(itemText);

                double value = quantity * item;

                //     write output record to output file
                DecimalFormat df = new DecimalFormat("0.00");
                pw.print(stock);
                pw.print("\t\t");
                pw.println(df.format(value));

                // Iterate to next line
                stock = stockReader.readLine();
            }// end of loop

            // Close Files
            pw.close();
            bw.close();
            fw.close();
            itemReader.close();
            itemFileRead.close();
            quantityReader.close();
            quantityFileRead.close();
            stockReader.close();
            stockFileRead.close();

        }
        catch (IOException e){
            System.out.println(e);
        }
    }// main
}// class
