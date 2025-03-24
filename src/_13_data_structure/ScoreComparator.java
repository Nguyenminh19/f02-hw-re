package _13_data_structure;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Student> {
    private final String sortType;

    ScoreComparator(String sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compare(Student s1, Student s2) {
        if (sortType.equals("asc")) {
            return s1.getAge() - s2.getAge();
        } else {
            return s2.getAge() - s1.getAge();
        }

    }
}
