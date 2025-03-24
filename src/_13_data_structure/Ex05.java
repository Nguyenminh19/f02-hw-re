package _13_data_structure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[ size ];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (i + 1) + ": ");

            int number = scanner.nextInt();
            array[ i ] = number;
            queue.offer(number);
        }

        System.out.println("List of numbers entered: ");
        while(!queue.isEmpty()) {
            int n = queue.poll();
            System.out.print(n + " ");
        }
    }
}
