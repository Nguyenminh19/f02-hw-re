package _04_loop_function;

public class HW12 {
    /*
        Một số nguyên dương được gọi là số hoàn hảo nếu nó bằng tổng của tất cả các ước số dương của nó, không bao gồm chính nó.
        Ví dụ, 28 là số hoàn hảo vì 28 = 14 + 7 + 4 + 2 + 1. Viết một chương trình để tìm các số hoàn hảo < 10.000.
     */

    public static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        int n = 10000;
        for (int i = 1; i < n; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i);
            }
        }
    }
}
