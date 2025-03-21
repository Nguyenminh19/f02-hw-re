package _12_exception;

import java.util.Scanner;

public class Ex06 {

    public static int inputPositiveNumber(Scanner scanner) throws NegativeNumberException {
        int number = 0;
        try {
            System.out.println("Please input positive number:");
            number = scanner.nextInt();
            if (number < 0) {
                throw new NumberFormatException();
            }

        } catch (NumberFormatException exception) {
            throw new NegativeNumberException(number);
        }
        return number;
    }

    public static void main(String[] args) throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int number = inputPositiveNumber(scanner);
                System.out.println("The entered number is: " + number);
                break;
            } catch (NegativeNumberException exception) {
                System.out.println(exception.getMessage());
            }
        }
        scanner.close();
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(int number) {
        super(number + " is less than 0");
    }
}