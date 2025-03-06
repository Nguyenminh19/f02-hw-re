package _05_arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HW08 {
    public static boolean containsAllPrimeDigit(int number) {
        while (number != 0) {
            int digit = number % 10;
            if (digit != 2 && digit != 3 && digit != 5 && digit != 7) {
                return false;
            }
            number = number / 10;
        }
        return true;
    }

    public static void main(String[] args) {
        File file = new File("src/_05_arrays/data/input/input08.txt");
        try (Scanner scanner = new Scanner(file)) {
            Map<Integer, Integer> map = new HashMap<>();

            while (scanner.hasNext()) {
                int number = scanner.nextInt();
                if (containsAllPrimeDigit(number)) {
                    if (!map.containsKey(number)) {
                        map.put(number, 1);
                    } else {
                        map.put(number, map.get(number) + 1);
                    }
                }
            }
            for (Integer number : map.keySet()) {
                System.out.println(number + ":" + map.get(number));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not exist." + file.getAbsolutePath());
        }
    }
}
