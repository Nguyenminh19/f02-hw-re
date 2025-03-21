package _12_exception;

import java.util.Scanner;

public class Ex05 {

    public static int inputAge() throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if(age < 6) {
            throw new InvalidAgeException("Your age must greater 6.");
        }
        scanner.close();
        return age;
    }
    public static void main(String[] args) {
        while(true) {
            try {
                int age = inputAge();
                System.out.println("Your age is " + age);
                break;
            } catch (InvalidAgeException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}
