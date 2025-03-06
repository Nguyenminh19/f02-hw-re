package _04_loop_function;

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int countPositive = 0;
        int countNegative = 0;

        while (true) {
            System.out.println("Enter number: ");
            i = scanner.nextInt();
            if (i < 0) {
                countNegative++;
            } else if (i > 0) {
                countPositive++;
            } else {
                break;
            }
        }

        System.out.println("Have " + countPositive + " positive number");
        System.out.println("Have " + countNegative + " negative number");
    }
}
