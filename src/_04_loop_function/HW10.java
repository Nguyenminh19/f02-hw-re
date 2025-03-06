package _04_loop_function;

public class Ex10 {
    /*
        Tìm số Fibonacci thứ n. Input nhận vào là số n (n > 0), output là số fibonacci của số n đó. Công thức truy hồi của dãy fibonacci có dạng:
        f(n) = f(n-1) + f(n-2). Với f(1) = 1; f(2) =1;
     */

    public static int fib(int number) {
        if (number == 1 || number == 2)
            return 1;
        return fib(number - 1) + fib(number - 2);
    }

    public static void main(String[] args) {
        System.out.println("finbonaccy cua so 15: " + fib(15));
    }
}
