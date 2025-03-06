package _02_variable_datatype_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File05 {
    public static void main(String[] args) {
        File file = new File("src/_02_variable_datatype_io/data/input/input05.txt");
        try (Scanner scanner = new Scanner(file)) {
            String name = scanner.nextLine();
            int age = scanner.nextInt();
            double height = scanner.nextDouble();

            System.out.println("Họ và tên: " + name);
            System.out.println("Tuổi: " + age);
            System.out.println("Chiêu cao: " + height + "m");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.getAbsolutePath());
        }
    }
}
