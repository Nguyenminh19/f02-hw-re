package _02_variable_datatype_io;

import java.io.*;
import java.util.Scanner;

public class File01 {
    public static void main(String[] args) throws IOException {
        File fileInput = new File("src/_02_variable_datatype_io/data/input/input01.txt");
        File fileOutput = new File("src/_02_variable_datatype_io/data/output/output01.txt");

        // Check file exist
        if (fileInput.exists()) {
            // Declare scanner
            Scanner scanner = new Scanner(fileInput);
            // Read input from file text1.txt
            double dblInchInput = scanner.nextDouble();

            // Write file
            FileWriter output = new FileWriter(fileOutput);
            output.write(dblInchInput + "inch = " + dblInchInput * 2.54 + "cm");

            // close connection
            scanner.close();
            output.close(); // close printWriter. If not close printWriter, nothing will be written to your file and it  will be blank
        }
    }
}
