import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n====== Student Record Manager ======");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student by ID");
            System.out.println("3. Delete Student by ID");
            System.out.println("4. Display All Students");
            System.out.println("5. Sort Students by Name");
            System.out.println("6. Sort Students by Age");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();
                    Student s = new Student(name, age, id);
                    manager.addStudent(s);
                    break;

                case 2:
                    System.out.print("Enter Student ID to search: ");
                    String searchId = scanner.nextLine();
                    manager.searchStudent(searchId);
                    break;

                case 3:
                    System.out.print("Enter Student ID to delete: ");
                    String deleteId = scanner.nextLine();
                    manager.deleteStudent(deleteId);
                    break;

                case 4:
                    manager.displayAllStudents();
                    break;

                case 5:
                    manager.sortByName();
                    break;

                case 6:
                    manager.sortByAge();
                    break;

                case 7:
                    System.out.println("Exiting. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
