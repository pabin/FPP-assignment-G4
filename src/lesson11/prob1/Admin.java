package lesson11.prob1;

import java.util.HashMap;
import java.util.List;

public class Admin {
    public static HashMap<Key, Student> processStudents(List<Student> students) {
        HashMap<Key, Student> map = new HashMap<>();
        for (Student student : students) {
            Key key = new Key(student.getFirstName(), student.getLastName());
            map.put(key, student);
        }
        System.out.println(map);
        return map;
    }
}
