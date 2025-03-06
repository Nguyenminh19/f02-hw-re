package _03_operators_conditions;

public class HW02 {
    public static void main(String[] args) {
        // check number is even or odd
        int number = 10;
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd numb");
        }

        // check number is negative or positive
        if (number < 0) {
            System.out.println(number + " is negative number");
        } else {
            System.out.println(number + " is positive number");
        }
    }
}
