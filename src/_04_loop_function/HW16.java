package _04_loop_function;

import java.util.Scanner;

public class HW16 {
    /*
         Viết chương trình kiểm tra một số nguyên dương bất kỳ (2 chữ số trở lên, không quá 9 chữ số) có chữ số bắt đầu và kết thúc bằng nhau hay không.
     */

    public static boolean checkStartEndDigit(Long number) {
        String strNumber = Long.toString(number);
        return strNumber.charAt(0) == strNumber.charAt(strNumber.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number;

        System.out.println("Nhap so nguyen duong(2 chữ số trở lên, không quá 9 chữ số): ");
        number = sc.nextLong();

        if (number < 10 || number > 999999999) {
            System.out.println("Invalid, nhap nguyên dương co 2 chữ số trở lên, không quá 9 chữ số");
        } else {
            System.out.println(checkStartEndDigit(number));
        }
        sc.close();
    }
}
