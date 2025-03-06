package _04_loop_function;

public class HW11 {
    /*
        Liệt kê tất cả số chính phương nhỏ hơn n ( n > 0). Input là một số n.
        Output sẽ in ra danh sách số chính phương nhỏ hơn n.
        (Số chính phương là số có thể biểu diễn dưới dạng bình phương của một số nguyên khác. Ví dụ 16 là số chính phương vì 16 = 42).
     */
    public static boolean isPerfectSquare(int n) {
        return ((int) Math.sqrt(n) * (int) Math.sqrt(n)) == n;
    }

    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i < n; i++) {
            if (isPerfectSquare(i)) {
                System.out.println(i);
            }
        }
    }
}
