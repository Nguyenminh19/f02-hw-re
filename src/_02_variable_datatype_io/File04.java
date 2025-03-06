package _02_variable_datatype_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File04 {
    public static void main(String[] args) {
        File fileInput = new File("src/_02_variable_datatype_io/data/input/input04.txt");
        File fileOutput = new File("src/_02_variable_datatype_io/data/output/output04.txt");

        try (Scanner scanner = new Scanner(fileInput); PrintWriter printWriter = new PrintWriter(fileOutput);) {
            int day = scanner.nextInt();
            int month = scanner.nextInt();
            int year = scanner.nextInt();
            printWriter.printf("%d %d %d theo format dd/mm/yyyy la: %d/%d/%d", day, month, year, day, month, year);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileInput.getAbsolutePath());
        }
    }
}
