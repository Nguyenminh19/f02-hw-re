package _13_data_structure;

import java.util.HashSet;

public class Ex03 {

    public static void unique(int[] array) {
        HashSet<Integer> uniqueList = new HashSet<>();
        for (int number : array) {
            uniqueList.add(number);
        }
        System.out.println("Has " + uniqueList.size() + "numbers different");
        System.out.println(uniqueList);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 2, 6, 2, 6, 2, 8};
        unique(array);
    }
}
