package _04_loop_function;

import java.util.Scanner;

public class HW13 {
    /*
        Viết một chương trình nhập vào n số nguyên, hiển thị số lần xuất hiện của số lớn nhất.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int tmp;
        int counter = 0;
        int max = Integer.MIN_VALUE;

        do {
            System.out.println("Nhap n: ");
            n = sc.nextInt();
        } while (n <= 0);

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap so thu " + (i + 1) + ": ");
            tmp = sc.nextInt();
            arr[i] = tmp;
            if (tmp > max) max = tmp;
        }
        System.out.println("So lon nhat la: " + max);

        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                counter++;
            }
        }
        System.out.println("So lan xuat hien la: " + counter);
        sc.close();
    }
}
