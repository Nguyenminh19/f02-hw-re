package _04_loop_function;

public class Ex07 {
    /*
        Viết chương trình tính giai thừa của một số n. S = 1*2*3*4*5*....*
     */
    public static long factorial(int n) {
        long rs = 1;
        for (int i = 1; i <= n; i++) {
            rs *= i;
        }
        return rs;
    }
    public static void main(String[] args) {
        int number = 6;
        System.out.println(factorial(number));
    }
}
