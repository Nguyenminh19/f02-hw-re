package _04_loop_function;

import java.util.Scanner;

public class Ex08 {
    /*
        Một người cần rút một số tiền T từ ngân hàng và muốn tổng số tờ ít nhất.
        Cho biết có các loại tiền mệnh giá 500, 200, 100, 20, 10, 5, 2 và 1.
        Nhập từ bàn phím số tiền T và in ra số tờ mỗi loại mệnh giá và tổng số tờ nhận được.
     */
    public static void main(String[] args) {
        int cntOf500, cntOf200, cntOf100, cntOf20, cntOf10, cntOf5, cntOf2, cntOf1;
        int remainder;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount money: ");
        int money = scanner.nextInt();

        cntOf500 = money / 500;
        remainder = money % 500;

        cntOf200 = remainder / 200;
        remainder = remainder % 200;

        cntOf100 = remainder / 100;
        remainder = remainder % 100;

        cntOf20 = remainder / 20;
        remainder = remainder % 20;

        cntOf10 = remainder / 10;
        remainder = remainder % 10;

        cntOf5 = remainder / 5;
        remainder = remainder % 5;

        cntOf2 = remainder / 2;
        cntOf1 = remainder % 2;

        System.out.printf("Co %d to 500", cntOf500);
        System.out.printf("\nCo %d to 200", cntOf200);
        System.out.printf("\nCo %d to 100", cntOf100);
        System.out.printf("\nCo %d to 20", cntOf20);
        System.out.printf("\nCo %d to 10", cntOf10);
        System.out.printf("\nCo %d to 5", cntOf5);
        System.out.printf("\nCo %d to 2", cntOf2);
        System.out.printf("\nCo %d to 1", cntOf1);
        System.out.println("\nTong so to: " + (cntOf500 + cntOf200 + cntOf100 + cntOf20 + cntOf10 + cntOf5 + cntOf2 + cntOf1));
    }
}
