package _13_data_structure;

import java.util.Scanner;
import java.util.Stack;

public class Ex04 {

    public static String reverse(String str) {
        Stack<Character> stack = new Stack();

        // add to stack
        for (Character c : str.toCharArray()) {
            stack.add(c);
        }

        StringBuilder rs = new StringBuilder();
        while (!stack.isEmpty()) {
            Character c = stack.pop();
            rs.append(c);
        }
        return rs.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String reverseString = reverse(str);
        System.out.println(reverseString);
        scanner.close();
    }
}
