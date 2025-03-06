package _04_loop_function;

public class HW02 {
    public static void main(String[] args) {
        double tuition = 10000;
        double percentIncrease = 0.05;
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            tuition = (tuition + tuition * percentIncrease);
            System.out.println("Hoc phi nam thu " + (i + 1) + ": " + tuition);
        }
        for (int i = 1; i <= 4; i++) {
            tuition = tuition + tuition * percentIncrease;
            sum += tuition;
        }

        System.out.println("Tổng chi phí học phí của 4 năm bắt đầu từ năm thứ 11: " + sum);
    }
}
