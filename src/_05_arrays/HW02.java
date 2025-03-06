package _05_arrays;

import java.util.Scanner;

public class HW02 {
    public static int findNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];

        // input array
        for (int i = 0; i < length; i++) {
            System.out.println("Enter the " + i + "-th element: ");
            arr[i] = sc.nextInt();
        }

        // find number
        System.out.println("Enter the number to find: ");
        int n = sc.nextInt();
        System.out.println(findNumber(arr, n));
    }
}
