package university.faculty;

public class Faculty {
    private String name;
    private String department;

    public Faculty(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Department: " + department);
    }
}

