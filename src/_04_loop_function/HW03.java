package _04_loop_function;

import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        int count;
        String name1stStudent = "";
        String name2rdStudent = "";
        double score1stStudent = 0;
        double score2rdStudent = 0;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a number of students: ");
            count = scanner.nextInt();
        } while (count < 2);

        for (int i = 0; i < count; i++) {
            System.out.println("Nhập họ tên của học sinh thứ " + (i + 1) + ": ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Nhập điểm số của học sinh thứ " + (i + 1) + ": ");
            double score = scanner.nextDouble();

            if (score > score1stStudent) {
                score2rdStudent = score1stStudent;
                score1stStudent = score;

                name2rdStudent = name1stStudent;
                name1stStudent = name;
            } else if (score > score2rdStudent) {
                score2rdStudent = score;
                name2rdStudent = name;
            }
        }

        System.out.println("Sinh viên có điểm số cao nhất: " + name1stStudent);
        System.out.println("Sinh viên có điểm số cao thứ hai: " + name2rdStudent);
    }
}
