package _13_data_structure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex02 {

    public static HashMap<String, Integer> counterWord(String paragraph) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = paragraph.split(" ");
        for (String word : words) {
            String wordLowerCase = removeNonAlphanumeric(word).toLowerCase();
            map.compute(wordLowerCase, (key, value) -> (value == null) ? 1 : value + 1);
        }
        return map;
    }

    public static String removeNonAlphanumeric(String input) {
        return input.replaceAll("[^a-zA-Z0-9]", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter paragraph: ");
        String paragraph = scanner.nextLine();
        HashMap<String, Integer> counterWord = counterWord(paragraph);
        for (Map.Entry<String, Integer> entry : counterWord.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
