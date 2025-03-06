package _04_loop_function;

public class HW05 {
    public static void main(String[] args) {
        int i = 1;
        while (true) {
            if (i * i * i > 12000) {
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}
