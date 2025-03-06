package _02_variable_datatype_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class File02 {
    public static void main(String[] args) throws FileNotFoundException {
        File fileInput = new File("src/_02_variable_datatype_io/data/input/input02.txt");
        File fileOutput = new File("src/_02_variable_datatype_io/data/output/output02.txt");

        if(fileInput.exists()) {
            // Declare scanner
            Scanner scanner = new Scanner(fileInput);
            // Declare printWriter
            PrintWriter printWriter = new PrintWriter(fileOutput);

            double dblFDegrees = scanner.nextDouble();
            printWriter.printf("Chuyển đổi %.2f F = %.2f C", dblFDegrees, (5.0/9 *  (dblFDegrees - 32)));
            double dblCDegrees = scanner.nextDouble();
            printWriter.printf("\nChuyển đổi %.2f C = %.2f F", dblCDegrees, (9.0/5 * dblCDegrees + 32));
            // close connection
            scanner.close();
            printWriter.close();
        }
    }
}
