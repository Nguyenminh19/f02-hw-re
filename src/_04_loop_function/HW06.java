package _04_loop_function;

public class HW06 {
    public static boolean isPrime(int number) {
        if (number < 2)
            return false;

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
