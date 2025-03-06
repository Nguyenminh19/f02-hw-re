package _04_loop_function;

public class Ex09 {
    /*
        Viết một chương trình tìm số lớn thứ 2 trong dãy số nguyên không âm.
        input là một dãy cần tìm, output là số lớn thứ 2 trong dãy.
     */
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9, 13, 2, 6, 65, 66};

        if (arr.length < 2) {
            System.out.println("Khong co so lon nhat thu 2");
        } else {
            int max1 = 0, max2 = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max1) {
                    max2 = max1;
                    max1 = arr[i];
                } else if (arr[i] >= max2) {
                    max2 = arr[i];
                }
            }
            System.out.println("So lon nhat thu 2 la: " + max2);
        }
    }
}
