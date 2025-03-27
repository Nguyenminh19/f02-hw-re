package _14_generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01 {
    static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();
        for (E item : list) {
            if (!result.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }

    static <T> void swap(T[] array, int i, int j) {
        T tmp = array[ i ];
        array[ i ] = array[ j ];
        array[ j ] = tmp;
    }

    static <T> int countOccurrences(List<T> list, T element) {
        int counter = 0;
        for (T item : list) {
            if (element == null) {
                if (item == null) {
                    counter++;
                }
            } else if (element.equals(item)) {
                counter++;
            }
        }
        return counter;
    }

    static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number item : list) {
            if (item != null) {
                sum += item.doubleValue();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);
        System.out.println("Danh sách ban đầu: " + numbers);
        ArrayList<Integer> uniqueNumbers = removeDuplicates(numbers);
        System.out.println("Danh sách không trùng lặp: " + uniqueNumbers);

        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", null, "apple");
        int appleCount = countOccurrences(fruits, "apple");
        int bananaCount = countOccurrences(fruits, "banana");
        int nullCount = countOccurrences(fruits, null);
        System.out.println("Occurrences of 'apple': " + appleCount);
        System.out.println("Occurrences of 'banana': " + bananaCount);
        System.out.println("Occurrences of null: " + nullCount);


        List<Number> numbers2 = List.of(1, 2.5, 3.0f, 4L);
        double total = sumNumbers(numbers2);
        System.out.println("Tổng các số: " + total);
    }
}
