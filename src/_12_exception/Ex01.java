package _12_exception;

import java.util.Scanner;

public class Ex01 {

    public static void inputNumber() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            int a = scanner.nextInt();
            System.out.println("Enter second number: ");
            int b = scanner.nextInt();
            double result = a * 1.0 / b;
            System.out.printf("\n%d \\ %d = %.2f", a, b, result);
        } catch (ArithmeticException exception) {
            System.out.println("Can not divide by zero");
        }
    }

    public static void main(String[] args) {
        inputNumber();
    }
}
