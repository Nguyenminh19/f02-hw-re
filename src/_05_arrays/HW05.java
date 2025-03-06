package _05_arrays;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HW05 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/_05_arrays/data/input/input05.txt");
        if (!file.exists()) {
            System.out.println("File not exist");
        } else {
            int sum = 0;
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                int num = scanner.nextInt();
                sum += num;
            }
            scanner.close();

            FileWriter wr = new FileWriter("src/_05_arrays/data/output/output05.txt");
            wr.write("Tổng: " + sum);
            wr.close();
        }
    }
}
