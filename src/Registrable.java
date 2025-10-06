public interface Registrable {
    void enroll(Student student) throws CourseFullException;
    void drop(Student student);
}