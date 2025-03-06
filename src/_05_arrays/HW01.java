package _05_arrays;

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int length = sc.nextInt();

        int sum = 0;
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter the " + (i + 1) + "-th element: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
