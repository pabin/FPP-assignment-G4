package lesson11.prob1;

import java.util.HashMap;
import java.util.List;

public class Admin {
    public static HashMap<Key, Student> processStudents(List<Student> students) {
        HashMap<Key, Student> processed = new HashMap<>();

        for (Student s : students) {
            Key key = new Key(s.getFirstName(), s.getLastName());
            processed.put(key, s);
        }
        return processed;
    }
}
