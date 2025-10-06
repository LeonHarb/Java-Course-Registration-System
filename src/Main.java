import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static RegistrationSystem system = new RegistrationSystem();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Course Registration System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Add Professor");
            System.out.println("3. Add Course");
            System.out.println("4. Register Student to Course");
            System.out.println("5. View Enrolled Students in Course");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> addProfessor();
                case 3 -> addCourse();
                case 4 -> registerStudent();
                case 5 -> viewCourseEnrollment();
                case 0 -> {
                    System.out.println("Exiting... Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter major: ");
        String major = scanner.nextLine();
        System.out.print("Enter GPA: ");
        double gpa = Double.parseDouble(scanner.nextLine());

        Student s = new Student(id, name, email, major, gpa);
        system.addPerson(s);
        System.out.println("Student added successfully.");
    }

    private static void addProfessor() {
        System.out.print("Enter professor ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        Professor p = new Professor(id, name, email, department);
        system.addPerson(p);
        System.out.println("Professor added successfully.");
    }

    private static void addCourse() {
        System.out.print("Enter course code: ");
        String code = scanner.nextLine();
        System.out.print("Enter course title: ");
        String title = scanner.nextLine();
        System.out.print("Enter max number of students: ");
        int max = Integer.parseInt(scanner.nextLine());

        System.out.print("Is this a lecture (L) or lab (B) course? ");
        String type = scanner.nextLine();

        Course c;
        if (type.equalsIgnoreCase("L")) {
            c = new LectureCourse(code, title, max);
        } else {
            c = new LabCourse(code, title, max);
        }

        system.addCourse(c);
        System.out.println("Course added successfully.");
    }

    private static void registerStudent() {
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();

        Student student = null;
        Course course = null;

        for (Person p : system.people) {
            if (p instanceof Student && p.getId().equals(studentId)) {
                student = (Student) p;
                break;
            }
        }

        for (Course c : system.courses) {
            if (c.getCourseCode().equals(courseCode)) {
                course = c;
                break;
            }
        }

        if (student == null || course == null) {
            System.out.println("Student or course not found.");
            return;
        }

        try {
            system.registerStudentToCourse(student, course);
            System.out.println("Student registered successfully.");
        } catch (CourseFullException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void viewCourseEnrollment() {
        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();

        for (Course c : system.courses) {
            if (c.getCourseCode().equals(courseCode)) {
                System.out.println("Students enrolled in " + c.getTitle() + ":");
                for (Student s : c.getEnrolledStudents()) {
                    System.out.println(" - " + s.getName());
                }
                return;
            }
        }
        System.out.println("Course not found.");
    }
}
