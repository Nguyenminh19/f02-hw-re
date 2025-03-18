package _12_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("Enter integer number: ");
                int number = scanner.nextInt();
                System.out.println(number + " is correct");
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Invalid number. Please enter integer number again.");
                // discarding invalid input
                scanner.next();
            }
        }
        scanner.close();
    }
}
