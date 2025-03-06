package _05_arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HW10 {
    public static int[][] readArrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();
        System.out.print("\n Enter number of rows: ");
        int rows = scanner.nextInt();
        int[][] array = new int[ rows ][ columns ];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("\nEnter element [%d][%d]: ", i, j);
                array[ i ][ j ] = scanner.nextInt();
            }
        }
        return array;
    }

    public static int[][] readArrayFromFile(String path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path));
        int rows = 0, columns = 0;
        while (scanner.hasNextLine()) {
            rows++;
            String line = scanner.nextLine();
            columns = line.trim().split(" ").length;
        }
        scanner.close();
        int[][] array = new int[ columns ][ rows ];
        scanner = new Scanner(path);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[ i ][ j ] = scanner.nextInt();
            }
        }
        scanner.close();
        return array;

    }

    public static void printConsole(int[][] array) {
        int rows = array.length;
        int columns = array[ 0 ].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[ i ][ j ] + " ");
            }
            System.out.println();
        }
    }

    public static void printArrayToFile(int[][] array, String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        int rows = array.length;
        int columns = array[ 0 ].length;

        PrintWriter writer = new PrintWriter(file);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                writer.print(array[ i ][ j ] + " ");
            }
            writer.println();
        }
        writer.close();
        scanner.close();
    }

    public static int sum(int[][] array) {
        int rows = array.length;
        int columns = array[ 0 ].length;
        int sum = array[ 0 ][ 0 ];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += array[ i ][ j ];
            }
        }
        return sum;
    }

    public static int max(int[][] array) {
        int rows = array.length;
        int columns = array[ 0 ].length;
        int max = array[ 0 ][ 0 ];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (max < array[ i ][ j ]) {
                    max = array[ i ][ j ];
                }
            }
        }
        return max;
    }

    public static int min(int[][] array) {
        int rows = array.length;
        int columns = array[ 0 ].length;
        int min = array[ 0 ][ 0 ];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (min > array[ i ][ j ]) {
                    min = array[ i ][ j ];
                }
            }
        }
        return min;
    }

    public static int[][] findIndexMax(int[][] array) {
        int rows = array.length;
        int columns = array[ 0 ].length;
        int max = max(array);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (max == array[ i ][ j ]) {
                    return new int[][]{{i, j}};
                }
            }
        }
        return new int[][]{{-1, -1}};
    }

    public static int[][] findIndexMin(int[][] array) {
        int rows = array.length;
        int columns = array[ 0 ].length;
        int min = min(array);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (min == array[ i ][ j ]) {
                    return new int[][]{{i, j}};
                }
            }
        }
        return new int[][]{{-1, -1}};
    }

    public static int[][] findFirstIndex(int[][] array, int n) {
        int rows = array.length;
        int columns = array[ 0 ].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (n == array[ i ][ j ]) {
                    return new int[][]{{i, j}};
                }
            }
        }
        return new int[][]{{-1, -1}};
    }

    public static int[][] findLastIndex(int[][] array, int n) {
        int rows = array.length;
        int columns = array[ 0 ].length;
        for (int i = rows - 1; i > 0; i--) {
            for (int j = columns - 1; j > 0; j--) {
                if (n == array[ i ][ j ]) {
                    return new int[][]{{i, j}};
                }
            }
        }
        return new int[][]{{-1, -1}};
    }

    public static void swap(int[][] array, int[] firstIndexPos, int[] secondIndexPos) {
        int tmp = array[ firstIndexPos[ 0 ] ][ firstIndexPos[ 1 ] ];
        array[ firstIndexPos[ 0 ] ][ firstIndexPos[ 1 ] ] = array[ secondIndexPos[ 0 ] ][ secondIndexPos[ 1 ] ];
        array[ secondIndexPos[ 0 ] ][ secondIndexPos[ 1 ] ] = tmp;
    }

    public static void main(String[] args) throws FileNotFoundException {
        int[][] array = readArrayFromConsole();
        printConsole(array);
        System.out.println("Sum: " + sum(array));
        System.out.println("Max: " + max(array));
        System.out.println("Min: " + min(array));
        System.out.printf("\nIndex of max value: [%d][%d]", findIndexMax(array)[ 0 ][ 0 ], findIndexMax(array)[ 0 ][ 1 ]);
        System.out.printf("\nIndex of min value: [%d][%d]", findIndexMin(array)[ 0 ][ 0 ], findIndexMin(array)[ 0 ][ 1 ]);
        System.out.printf("\nFirst index of 6: [%d][%d]", findFirstIndex(array, 6)[ 0 ][ 0 ], findFirstIndex(array, 6)[ 0 ][ 1 ]);
        System.out.printf("\nLast index of 6: [%d][%d]", findLastIndex(array, 6)[ 0 ][ 0 ], findLastIndex(array, 6)[ 0 ][ 1 ]);
        swap(array, new int[]{0, 0}, new int[]{0, 1});
        printArrayToFile(array, "src/_05_arrays/data/input/input10.txt");
        readArrayFromFile("src/_05_arrays/data/input/input10.txt");
    }
}
