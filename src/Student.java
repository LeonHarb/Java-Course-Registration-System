import java.util.*;

public class Student extends Person {
    private String major;
    private double gpa;
    private List<Course> completedCourses;

    public Student(String id, String name, String email, String major, double gpa) {
        super(id, name, email);
        this.major = major;
        this.gpa = gpa;
        this.completedCourses = new ArrayList<>();
    }

    public void addCompletedCourse(Course course) {
        completedCourses.add(course);
    }

    public List<Course> getCompletedCourses() {
        return completedCourses;
    }
}