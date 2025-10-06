import java.util.*;

public abstract class Course {
    protected String courseCode;
    protected String title;
    protected int maxStudents;
    protected List<Student> enrolledStudents;

    public Course(String courseCode, String title, int maxStudents) {
        this.courseCode = courseCode;
        this.title = title;
        this.maxStudents = maxStudents;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseCode() { 
    	return courseCode; 
    }
    public String getTitle() { 
    	return title; 
    }
    public List<Student> getEnrolledStudents() { 
    	return enrolledStudents; 
    }
}
