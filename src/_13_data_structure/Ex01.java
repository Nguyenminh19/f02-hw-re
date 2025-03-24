package _13_data_structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {

    public static void displayMenu() {
        System.out.println("-".repeat(10));
        System.out.println("1. Add number" +
                "\n2. Update number" +
                "\n3. Remove number" +
                "\n4. Display all" +
                "\n9. Exit");
        System.out.println("-".repeat(10));
    }

    public static void add(List<Integer> list, int number) {
        list.add(number);
    }

    public static void update(List<Integer> list, int index, int newValue) throws NullPointerException {
        if (list.isEmpty()) {
            throw new NullPointerException("List is empty");
        }

        list.set(index, newValue);
    }

    public static void remove(List<Integer> list, int index) throws NullPointerException {
        if (list.isEmpty()) {
            throw new NullPointerException("List is empty");
        }

        if(index < 0 || index > list.size()) {
            throw new IndexOutOfBoundsException("Index invalid");
        }

        list.remove(index);
    }

    public static void display(List<Integer> list) {
        System.out.println("List: ");
        for(Integer number: list) {
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter number to add:  ");
                    int number = scanner.nextInt();
                    add(list, number);
                }
                case 2 -> {
                    System.out.print("Enter index to update  ");
                    int index = scanner.nextInt();
                    System.out.print("\nEnter new value to update  ");
                    int newValue = scanner.nextInt();
                    update(list, index, newValue);
                }
                case 3 -> {
                    System.out.print("Enter index to remove  ");
                    int index = scanner.nextInt();
                    remove(list, index);
                }
                case 4 -> {
                    display(list);
                }
                case 9 -> {
                }
            }
        }
    }
}
