package _03_operators_conditions;

public class HW06 {
    public static void main(String[] args) {
        float a = 3, b = 6, c = 4;

        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            System.out.println("Is right triangle");
        } else {
            System.out.println("Is not right triangle");
        }
    }
}
