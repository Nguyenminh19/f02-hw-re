package _04_loop_function;

public class HW15 {
    /*
        Viết chương trình tìm ước số chung lớn nhất và bội số chung nhỏ nhất của hai số nguyên dương a,b.
     */

    public static int findGreatestCommonDivisor(int a, int b) {
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return a;
    }

    public static int findLeastCommonMultiple(int a, int b) {
        return a * b / findGreatestCommonDivisor(a, b);
    }

    public static void main(String[] args) {
        System.out.println("Uoc chung lon nhat " + findGreatestCommonDivisor(24, 20));
        System.out.println("Boi chung nho nhat " + findLeastCommonMultiple(24, 20));
    }
}
