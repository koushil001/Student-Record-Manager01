import java.util.*;

public class StudentManager {
    private HashMap<String, Student> studentMap;

    public StudentManager() {
        studentMap = new HashMap<>();
    }

    // Add a new student
    public void addStudent(Student student) {
        if (studentMap.containsKey(student.getStudentId())) {
            System.out.println("Student with ID " + student.getStudentId() + " already exists.");
        } else {
            studentMap.put(student.getStudentId(), student);
            System.out.println("Student added successfully.");
        }
    }

    // Search for a student by ID
    public void searchStudent(String studentId) {
        Student s = studentMap.get(studentId);
        if (s != null) {
            s.displayDetails();
        } else {
            System.out.println("Student not found.");
        }
    }

    // Delete a student by ID
    public void deleteStudent(String studentId) {
        if (studentMap.remove(studentId) != null) {
            System.out.println("Student removed.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Display all students
    public void displayAllStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }

        for (Student s : studentMap.values()) {
            s.displayDetails();
            System.out.println("----------------------");
        }
    }

    // Sort by Name
    public void sortByName() {
        List<Student> list = new ArrayList<>(studentMap.values());
        list.sort(Comparator.comparing(Student::getName));

        System.out.println("Students sorted by name:");
        for (Student s : list) {
            s.displayDetails();
            System.out.println("----------------------");
        }
    }

    // Sort by Age
    public void sortByAge() {
        List<Student> list = new ArrayList<>(studentMap.values());
        list.sort(Comparator.comparingInt(Student::getAge));

        System.out.println("Students sorted by age:");
        for (Student s : list) {
            s.displayDetails();
            System.out.println("----------------------");
        }
    }
}
