package _05_arrays;

public class HW06 {
    public static boolean isSymmetric(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[ i ] != arr[ arr.length - i - 1 ]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 2, 1};
        System.out.println(isSymmetric(arr1));
        int[] arr2 = new int[]{1, 2, 3, 3, 2, 1};
        System.out.println(isSymmetric(arr2));
        int[] arr3 = new int[]{1, 2, 3, 3, 2, 1, 2};
        System.out.println(isSymmetric(arr3));
        int[] arr4 = new int[]{1};
        System.out.println(isSymmetric(arr4));
    }
}
