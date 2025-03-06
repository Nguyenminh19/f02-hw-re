package _04_loop_function;

public class HW19 {
    /*
        19. Một số được gọi là số tăng giảm nếu số đó có các chữ số thỏa mãn hoặc không giảm, hoặc không tăng từ trái qua phải.
        Hãy kiểm tra xem một số có phải số tăng giảm hay không. Ví dụ nhập vào 2345566778899 ⇒ kết quả in ra YES, nhập vào 4343531987 ⇒ kết quả in ra NO.
     */

    public static boolean isIncreaseOrDecreaseNumber(long number) {
        boolean hasIncrease = false;
        boolean hasDecrease = false;

        String strNumber = String.valueOf(number);

        if (number <= 2) return true;

        for (int i = 1; i < strNumber.length(); i++) {
            if (strNumber.charAt(i) >= strNumber.charAt(i - 1)) {
                hasIncrease = true;
            } else {
                hasDecrease = true;
            }
        }
        return !(hasDecrease && hasIncrease);
    }

    public static void main(String[] args) {
        System.out.println(isIncreaseOrDecreaseNumber(23458899));
        System.out.println(isIncreaseOrDecreaseNumber(43531987));
    }
}
