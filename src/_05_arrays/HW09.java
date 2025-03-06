package _05_arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW09 {
    public static int[] readArrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int length = scanner.nextInt();
        int[] arr = new int[ length ];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\nEnter " + i + "-th element: ");
            arr[ i ] = scanner.nextInt();
        }
        scanner.close();
        return arr;
    }

    public static int[] readArrayFromFile(String path) throws FileNotFoundException {
        File file = new File(path);

        if (!file.exists()) {
            System.out.println("File not exist. Please check path file again");
            return null;
        }

        Scanner scanner = new Scanner(file);
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }
        scanner.close();
        int[] arr = new int[ list.size() ];
        for (int i = 0; i < list.size(); i++) {
            arr[ i ] = list.get(i);
        }
        return arr;
    }

    public static void printArrayToConsole(int[] arr) {
        System.out.print("Array: ");
        for (int number : arr) {
            System.out.print(number + " ");
        }
    }

    public static void writeArrayToFile(String path, int[] arr) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("File not exist. Please check again");
        } else {
            PrintWriter writer = new PrintWriter(file);
            for (int number : arr) {
                writer.write(number + " ");
            }
            writer.close();
        }
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }

    public static int max(int[] arr) {
        int max = arr[ 0 ];
        for (int n : arr) {
            if (max < n) {
                max = n;
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[ 0 ];
        for (int n : arr) {
            if (min > n) {
                min = n;
            }
        }
        return min;
    }

    public static int findIndexMinEl(int[] arr) {
        int min = min(arr);
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[ i ] == min) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int findIndexMaxEl(int[] arr) {
        int max = max(arr);
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[ i ] == max) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int findFirstIndex(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[ i ] == n) {
                return i;
            }
        }
        return -1;
    }

    public static int findLastIndex(int[] arr, int n) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[ i ] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void swap(int[] arr, int firstIndex, int secondIndex) {
        int tmp = arr[ firstIndex ];
        arr[ firstIndex ] = arr[ secondIndex ];
        arr[ secondIndex ] = tmp;
    }

    public static void main(String[] args) throws IOException {
        int[] arr1 = readArrayFromConsole();
        printArrayToConsole(arr1);
        System.out.println("Sum: " + sum(arr1));
        System.out.println("Max value in array: " + max(arr1));
        System.out.println("Min value in array: " + min(arr1));
        System.out.println("Index of max element in array: " + findIndexMaxEl(arr1));
        System.out.println("Index of min element in array: " + findIndexMinEl(arr1));
        System.out.println("First index of 6 in array: " + findFirstIndex(arr1, 6));
        System.out.println("Last index of 6 in array: " + findLastIndex(arr1, 6));
        swap(arr1, 1, 3);
        writeArrayToFile("src/_05_arrays/data/input/input09.txt", arr1);
        readArrayFromFile("src/_05_arrays/data/input/input09.txt");
    }
}
