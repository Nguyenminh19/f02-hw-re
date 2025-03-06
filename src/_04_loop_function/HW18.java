package _04_loop_function;


public class HW18 {
    /*
        18. Cho một phép toán có dạng a+b=c với a,b,c chỉ là các số nguyên dương có một chữ số. Hãy kiểm tra xem phép toán đó có đúng hay không. Ví dụ
        nhập vào 1+2=3 ⇒ kết quả in ra YES, nhập vào 2+2=5 ⇒ kết quả in ra NO.
     */

    public static boolean isValid(String str) {
        if (str.length() != 5) {
            return false;
        }

        int a = Integer.parseInt(str.substring(0, 1));
        int b = Integer.parseInt(str.substring(2, 3));
        int c = Integer.parseInt(str.substring(4, 5));

        return c == a + b;
    }

    public static void main(String[] args) {
        String input = "5+4=9";
        if (isValid(input)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
