package _12_exception;

import java.util.ArrayList;

public class Ex09 {
    public static void main(String[] args) {
        ClassManagement classManagement = new ClassManagement();

        try {
            classManagement.displayAll();

            Student st1 = new Student("001", "A", 22);
            Student st2 = new Student("002", "B", 25);
            Student st3 = new Student("003", "C", 30);
            Student st4 = new Student("004", "D", 35);
            Student st5 = null;

            classManagement.addStudent(st1);
            classManagement.addStudent(st2);
            classManagement.addStudent(st3);
            classManagement.addStudent(st4);

            classManagement.removeStudentByIndex(4);
            classManagement.removeStudentByIndex(2);
            classManagement.removeStudent("001");

            classManagement.addStudent(st5);

            classManagement.displayAll();

        } catch (IndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

class ClassManagement {

    private ArrayList<Student> studentList;

    ClassManagement() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(String id) {
        Student st = findStudentById(id);
        try {
            this.studentList.remove(st);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeStudentByIndex(int index) {
        try {
            this.studentList.remove(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    private Student findStudentById(String id) {
        for (int i = 0; i < studentList.size(); i++) {
            Student st = studentList.get(i);
            if (st.getId().equals(id)) {
                return st;
            }
        }
        return null;
    }

    public void displayAll() {
        if (this.studentList.size() == 0) {
            throw new NullPointerException("No has students.");
        }
        System.out.println("--------------");
        for (Student st : studentList) {
            System.out.println(st);
        }
        System.out.println("--------------");
    }
}


class Student {
    private String id;
    private String name;
    private int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}