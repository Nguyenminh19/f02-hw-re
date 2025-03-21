package _12_exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        final String STR_PATH_FILE = "src/_12_exception/data/output.txt";
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter printWriter = new PrintWriter(STR_PATH_FILE
             )
        ) {
            System.out.println("Write something: ");
            String strLine = scanner.nextLine();
            printWriter.write(strLine);
            System.out.println("Write success");
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.out.println("Write fail");
        }
    }
}
