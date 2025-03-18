package _12_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {

    public static int[] createArray(Scanner scanner) {
        int[] array;
        while(true) {
            try {
                System.out.println("Enter length of array: ");
                int length = scanner.nextInt();
                array = new int[length];
                for(int i = 0; i < length; i++) {
                    System.out.println("Enter " + i + " element: ");
                    int value = scanner.nextInt();
                    array[i] = value;
                }
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Invalid input. Please enter length of array.");
                scanner.next();
            }
        }
        System.out.println("Done create");
        return array;
    }

    public static void updateArray(Scanner scanner, int[] array) {
        int index = 0, value = 0;
        boolean isCorrectIndex = false;
        boolean isCorrectValue = false;

        while(true) {
            try{
                if(!isCorrectIndex) {
                    System.out.println("Enter index of element to update: ");
                    index = scanner.nextInt();
                    isCorrectIndex = true;
                }

                if(!isCorrectValue) {
                    System.out.println("Enter new value: ");
                    value = scanner.nextInt();
                    isCorrectValue = true;
                }
                array[index] = value;
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Invalid input. Please enter integer");
                scanner.next(); // Clear invalid input
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Invalid index! Please enter a value between 0 and " + (array.length - 1) + ".");
                isCorrectIndex = false;
                isCorrectValue = false;
            }
        }
        System.out.println("Update done");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = createArray(scanner);
        updateArray(scanner, array);
        scanner.close();
    }
}
