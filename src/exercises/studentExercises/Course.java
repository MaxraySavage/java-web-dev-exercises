package exercises.studentExercises;

import java.util.ArrayList;

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
}
