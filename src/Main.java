import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    // Search Student by ID
    public static Student searchStudent(List<Student> students, int id) {
        for (Student s : students) {
            if (s.getStudentId() == id) {
                return s;
            }
        }
        return null;
    }

    // Group Students by Gender
    public static Map<String, List<Student>> groupByGender(List<Student> students) {

        Map<String, List<Student>> map = new HashMap<>();

        for (Student s : students) {

            String gender = s.getGender();

            if (!map.containsKey(gender)) {
                map.put(gender, new ArrayList<>());
            }

            map.get(gender).add(s);
        }

        return map;
    }

    public static void main(String[] args) {

        DataStore<Student> store = new DataStore<>();

        // Adding Students
        store.add(new Student(1, "Rahim", 3.75, "Male"));
        store.add(new Student(2, "Karim", 3.50, "Male"));
        store.add(new Student(3, "Ayesha", 3.90, "Female"));
        store.add(new Student(4, "Fatima", 3.60, "Female"));

        List<Student> students = store.getAll();


        System.out.println("\n=======Student Record Management System=====\n");

        // Task 2: Sort Students by GPA
        students.sort(Comparator.comparingDouble(Student::getGpa));

        System.out.println("Sorted by GPA:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Task 3: Search Student
        Student found = searchStudent(students, 3);

        System.out.println("\nSearch Result:");
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Student not found");
        }

        // Task 4: Group by Gender
        Map<String, List<Student>> grouped = groupByGender(students);

        System.out.println("\nGrouped by Gender:");

        for (String gender : grouped.keySet()) {
            System.out.println(gender + ":");
            for (Student s : grouped.get(gender)) {
                System.out.println(s);
            }
        }
    }
}