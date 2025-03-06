package _05_arrays;

public class HW07 {
    public static void main(String[] args) {
        int[] array = new int[]{10, 5, 3, 4, 3, 5, 6};
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[ i ] == array[ j ]) {
                    result = array[ i ];
                    break;
                }
            }
            if (result != -1) break;
        }
        if (result == -1) {
            System.out.println("NO");
        } else {
            System.out.println(result);
        }
    }
}
