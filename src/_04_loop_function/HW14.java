package _04_loop_function;

import java.util.Scanner;

public class HW14 {
    /*
        Viết một chương trình nhập vào một string và hiển thị ra ký tự có số lần xuất hiện nhiều nhất trong string đó.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi string: ");
        String str = scanner.nextLine();

        int[] charCount = new int[256];

        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        int maxCount = 0;
        char maxChar = ' ';
        for (int i = 0; i < charCount.length; i++) {
            if (maxCount < charCount[i]) {
                maxChar = (char) i;
                maxCount = charCount[i];
            }
        }
        System.out.println(maxChar);
    }
}
