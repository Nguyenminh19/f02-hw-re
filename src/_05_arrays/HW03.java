package _05_arrays;

import java.util.Scanner;

public class HW03 {
    public static int findLargestNumber(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("\nEnter the elements [%d][%d] the array: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The largest number: " + findLargestNumber(arr));
        sc.close();
    }
}
