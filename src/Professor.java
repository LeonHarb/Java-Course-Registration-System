import java.util.*;

public class Professor extends Person {
    private String department;
    private List<Course> coursesTeaching;

    public Professor(String id, String name, String email, String department) {
        super(id, name, email);
        this.department = department;
        this.coursesTeaching = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        coursesTeaching.add(course);
    }

    public List<Course> getCoursesTeaching() {
        return coursesTeaching;
    }
}
