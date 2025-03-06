package _04_loop_function;

import java.util.Scanner;

public class HW17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.print(n + " = ");

        for (int i = 2; i <= n; i++) {
            int count = 0;
            while (n % i == 0) {
                count++;
                n /= i;
            }
            if (count > 0) {
                System.out.print(i + "^" + count);
                if (n > 1) System.out.print(" x ");
            }
        }
    }
}
