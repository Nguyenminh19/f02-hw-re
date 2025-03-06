package _02_variable_datatype_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File03 {
    public static void main(String[] args)  {
        File fileInput = new File("src/_02_variable_datatype_io/data/input/input03.txt");
        File fileOutput = new File("src/_02_variable_datatype_io/data/output/output03.txt");

        try(Scanner scanner = new Scanner(fileInput)) {
            PrintWriter printWriter = new PrintWriter(fileOutput);
            int intMinuteNumberInput = scanner.nextInt();

            int intYear = intMinuteNumberInput / (60 * 24 * 365);
            int remainderMinus = intMinuteNumberInput % (60 * 24 * 365);

            int intDay = remainderMinus / (60 * 24);
            remainderMinus = remainderMinus % (60 * 24);

            int intHour = remainderMinus / 60;
            int intMinute = remainderMinus % (60);

            printWriter.printf("%d minutes = %d years %d days %d hours %d minutes", intMinuteNumberInput, intYear, intDay, intHour, intMinute);

            // close connection
            scanner.close();
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileInput.getAbsolutePath());
        }
    }
}
