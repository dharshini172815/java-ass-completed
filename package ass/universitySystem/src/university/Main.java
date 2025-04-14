package university;

import university.students.Student;
import university.courses.Course;
import university.faculty.Faculty;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 101);
        Course course = new Course("Data Structures", "CS201");
        Faculty faculty = new Faculty("Dr. Smith", "Computer Science");

        System.out.println(" Student Info:");
        student.displayInfo();

        System.out.println("\nCourse Info:");
        course.displayInfo();

        System.out.println("\nFaculty Info:");
        faculty.displayInfo();
    }
}
