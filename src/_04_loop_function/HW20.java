package _04_loop_function;

public class HW20 {
    /*
        20. Cho số nguyên dương N. Nhiệm vụ của bạn là hãy xác định xem có bao nhiêu ước số của N chia hết cho 2.
     */
    public static void main(String[] args) {
        int n = 1242;
        int cnt = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0 && i % 2 == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
