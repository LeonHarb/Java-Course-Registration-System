import java.util.*;

public class RegistrationSystem {
    protected List<Course> courses;
    protected List<Person> people;

    public RegistrationSystem() {
        courses = new ArrayList<>();
        people = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void registerStudentToCourse(Student student, Course course) throws CourseFullException {
        if (course.enrolledStudents.size() >= course.maxStudents) {
            throw new CourseFullException("Course is full: " + course.getTitle());
        }
        course.enrolledStudents.add(student);
    }
}