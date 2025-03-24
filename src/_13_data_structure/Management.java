package _13_data_structure;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Management {
    final static String STUDENT_FILE_PATH = "src/_13_data_structure/data/database.txt";
    final static String STR_SEPARATE_COMMA = ",";
    private static ArrayList<Student> students = new ArrayList<>();

    private final static String SORT_TYPE_DESC = "desc";

    private final static String SORT_TYPE_ASC = "asc";

    static int counter = 0;

    // read student database
    static {
        System.out.println("Read database start");
        try {
            Scanner scanner = new Scanner(new File(STUDENT_FILE_PATH));


            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] studentDetail = line.split(STR_SEPARATE_COMMA);
                Student student = new Student(studentDetail[ 0 ], studentDetail[ 1 ], Integer.valueOf(studentDetail[ 2 ]), Double.valueOf(studentDetail[ 3 ]));
                addStudent(student);
                counter++;
            }

            scanner.close();
            System.out.println("Read database end");
        } catch (FileNotFoundException e) {
            System.out.println("Read database fail");
            throw new RuntimeException(e);
        }
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=".repeat(20));
            System.out.println("Quan ly sinh vien".toUpperCase(Locale.ROOT));
            System.out.println("=".repeat(20));
            System.out.println("1. Them sinh vien" + "\n2. Sua sinh vien" + "\n3. Xoa sinh vien" + "\n4. Hien thi danh sach sinh vien" + "\n5. Sap xep danh sach" + "\n\t5.1. Theo ho ten (A -> Z)" + "\n\t5.2. Theo diem trung binh (Tang dan)" + "\n\t5.3. Theo diem trung binh (Giam dan(" + "\n6. Tim kiem sinh vien" + "\n7. Thoat chuong trinh");
            System.out.println("=".repeat(20));
            System.out.println("Nhap lua chon cua ban");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1": {
                    System.out.print("Nhap ten sinh vien: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhap tuoi: ");
                    int age = scanner.nextInt();
                    System.out.println("Nhap diem trung binh: ");
                    double score = scanner.nextDouble();
                    String id = generateID();
                    Student student = new Student(id, name, age, score);
                    students.add(student);
                    System.out.println("Add success");
                    break;
                }
                case "2": {
                    System.out.println("Nhap ma so sinh vien can update: ");
                    String id = scanner.nextLine();
                    Student student = findStudent(id);
                    System.out.println("Nhap ten moi: ");
                    student.setFullname(scanner.nextLine());
                    System.out.println("Nhap tuoi moi: ");
                    student.setAge(scanner.nextInt());
                    System.out.println("Nhap diem trung binh moi: ");
                    student.setScore(scanner.nextDouble());
                    System.out.println("Update success");
                    break;
                }
                case "3": {
                    System.out.println("Nhap ma so sinh vien can xoa:");
                    String id = scanner.nextLine();
                    Student student = findStudent(id);
                    if (student == null) {
                        System.out.println("Not found");
                    } else {
                        students.remove(student);
                        System.out.println("Delete success");
                    }
                    break;
                }
                case "4": {
                    displayAll(students);
                    break;
                }
                case "5.1": {
                    ArrayList<Student> studentsCopy = new ArrayList<>();
                    studentsCopy.addAll(students);
                    Collections.sort(studentsCopy, new FullnameComparator());
                    System.out.println("Danh sach sau khi sort: ");
                    displayAll(studentsCopy);
                    break;
                }
                case "5.2": {
                    ArrayList<Student> studentsCopy = new ArrayList<>();
                    studentsCopy.addAll(students);
                    Collections.sort(studentsCopy, new ScoreComparator(SORT_TYPE_ASC));
                    System.out.println("Danh sach sau khi sort: ");
                    displayAll(studentsCopy);
                    break;
                }

                case "5.3": {
                    ArrayList<Student> studentsCopy = new ArrayList<>();
                    studentsCopy.addAll(students);
                    Collections.sort(studentsCopy, new ScoreComparator(SORT_TYPE_DESC));
                    System.out.println("Danh sach sau khi sort: ");
                    displayAll(studentsCopy);
                    break;
                }
                case "6": {
                    System.out.println("Nhap ma so sinh vien can update: ");
                    String id = scanner.nextLine();
                    Student student = findStudent(id);
                    System.out.println("Thong tin sinh vien: ");
                    System.out.println(student);
                    break;
                }
                case "7": {
                    try {
                        writeDatabase();
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException("Write database fail");
                    }
                    return;
                }
            }
        }
    }

    public static void addStudent(Student student) {
        students.add(student);
    }

    public static Student findStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }


    public static String generateID() {
        counter++;
        String id = "ST" + String.format("%5s", counter).replace(' ', '0');
        return id;
    }

    public static void displayAll(ArrayList<Student> students) {
        System.out.println("=".repeat(20));
        System.out.println("Thong tin hoc sinh");
        System.out.println("=".repeat(20));

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void writeDatabase() throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(STUDENT_FILE_PATH);
        for (Student student : students) {
            String line = student.toString();
            printWriter.println(line);
        }
        printWriter.close();
    }
}
