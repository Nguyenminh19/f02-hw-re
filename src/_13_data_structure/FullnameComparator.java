package _13_data_structure;

import java.util.Comparator;

public class FullnameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getFullname().compareTo(s2.getFullname());
    }
}
