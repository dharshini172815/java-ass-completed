package university.courses;

public class Course {
    private String courseName;
    private String courseCode;

    public Course(String name, String code) {
        this.courseName = name;
        this.courseCode = code;
    }

    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }
}

