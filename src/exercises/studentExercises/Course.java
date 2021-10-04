package exercises.studentExercises;

import java.util.ArrayList;
import java.util.Objects;

public class Course {

    private String title;
    private String description;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String title, String description, Teacher instructor, ArrayList<Student> studentList) {
        this.title = title;
        this.description = description;
        this.instructor = instructor;
        this.enrolledStudents = studentList;
    }

    public Course(String title, String description, Teacher instructor) {
        this(title, description, instructor, new ArrayList<>());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(getTitle(), course.getTitle()) && Objects.equals(getDescription(), course.getDescription()) && Objects.equals(getInstructor(), course.getInstructor()) && Objects.equals(enrolledStudents, course.enrolledStudents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getDescription(), getInstructor(), enrolledStudents);
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", instructor=" + instructor +
                '}';
    }
}
