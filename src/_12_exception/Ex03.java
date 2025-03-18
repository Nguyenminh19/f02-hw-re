package _12_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {

    public static int inputNumber(String message) throws InputMismatchException{
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int number = scanner.nextInt();
        return number;
    }
    public static void main(String[] args) {
        int a, b, result;
        try {
            a = inputNumber("Enter first number: ");
            b = inputNumber("Enter second number: ");
            result = a + b;
            System.out.printf("\n%d + %d = %d", a, b, result);
        } catch (InputMismatchException exception) {
            System.out.println("Invalid integer number.");
        } finally {
            System.out.println("Done");
        }
    }
}
