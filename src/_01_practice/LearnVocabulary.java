package _01_practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LearnVocabulary {

    public static ArrayList<String> getVocabulary(String pathFile) throws FileNotFoundException {
        File file = new File(pathFile);
        if(!file.exists()) {
            return null;
        }
        Scanner scanner = new Scanner(file);
        ArrayList<String> arrayList = new ArrayList<>();
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            arrayList.add(line);
        }
        scanner.close();
        return arrayList;
    }
    public static void main(String[] args) throws FileNotFoundException {
        final String EN_VOCABULARY_PATH = "src/_01_practice/en.txt";
        final String VN_VOCABULARY_PATH = "src/_01_practice/vn.txt";


        ArrayList<String> vnArray = getVocabulary(VN_VOCABULARY_PATH);
        ArrayList<String> enArray = getVocabulary(EN_VOCABULARY_PATH);

        int length = vnArray.size();

        Scanner scanner = new Scanner(System.in);


        while(true) {
            int indexRandom = (int) (Math.random() * (length));
            String vn_line = vnArray.get(indexRandom);
            System.out.println("Write english with vietnamese equal is: " + vn_line.trim());
            String answer = scanner.nextLine();
            if(answer == "0") {
                break;
            }
            if(isTrue(answer.trim(), enArray.get(indexRandom).trim())) {
                System.out.println("----> Right");
            } else {
                System.out.println(enArray.get(indexRandom) + ":" + vnArray.get(indexRandom));
            }
        }
    }

    public static boolean isTrue(String answer, String en) {
        return answer.equals(en);
    }
}
