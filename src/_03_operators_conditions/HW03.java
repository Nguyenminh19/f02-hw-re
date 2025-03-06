package _03_operators_conditions;

public class HW03 {
    public static void main(String[] args) {
        int a = 10, b = 12;
        // Addition
        System.out.printf("%d + %d = %d", a, b, a + b);
        // Subtraction
        System.out.printf("\n%d - %d = %d", a, b, a - b);
        // Multiplication
        System.out.printf("\n%d * %d = %d", a, b, a * b);

        if (b == 0) {
            System.out.printf("\n Cannot divided by 0");
        } else {
            System.out.printf("\n %d \\ %d = %f", a, b, (float) a / b);
        }
    }
}
