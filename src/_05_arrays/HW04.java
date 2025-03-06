package _05_arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HW04 {
    public static void writeArray(int[][][] array, File file) {
        try (PrintWriter printWriter = new PrintWriter(file)) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    for (int k = 0; k < array[i][j].length; k++) {
                        printWriter.write(array[i][j][k] + "\n");
                    }
                }
            }
            System.out.println("Write done");
        } catch (FileNotFoundException e) {
            System.out.println("File not found. " + file.getAbsolutePath());
        }
    }

    public static void main(String[] args) {
        int rows, columns, heights;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        columns = scanner.nextInt();
        System.out.println("Enter the number of heights:");
        heights = scanner.nextInt();

        int[][][] array = new int[rows][columns][heights];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < heights; k++) {
                    System.out.printf("\nEnter the elements [%d][%d][%d] the array: ", i, j, k);
                    array[i][j][k] = scanner.nextInt();
                }
            }
        }
        File file = new File("src/main/java/arrays/file/hw04.txt");
        writeArray(array, file);
        scanner.close();
    }
}
