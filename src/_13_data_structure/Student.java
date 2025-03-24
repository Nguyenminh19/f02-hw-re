package _13_data_structure;

public class Student {
    private String id;
    private String fullname;
    private int age;
    private double score;

    public String getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public int getAge() {
        return age;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(String id, String fullname, int age, double score) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return id + "," + fullname + "," + age + "," + score;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            return this.getId().equals(((Student) obj).getId());
        }
        return false;
    }
}
