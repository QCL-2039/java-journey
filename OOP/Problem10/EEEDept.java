package OOP.Problem10;

import java.util.ArrayList;

public class EEEDept extends Student {
    ArrayList<Course> courselist = new ArrayList<>();
    public static String department = "EEE";
    public static int studentCounter = 202020;

    public EEEDept(String name) {
        super(name);
        this.studentID = department + studentCounter++;
    }

    public void showStudentDetails() {
        System.out.println("Student Name: " + name + " Department: " + department + " Student ID: " + studentID);
    }

    public void addCourse(Course c) {
        courselist.add(c);
    }

    public void showCourselist() {
        for (Course c : courselist) {
            System.out.println(
                    "Course Title: " + c.courseTitile + " Course Code: " + c.courseCode + " Credit: " + c.credit);
        }
    }

    public void gradeCalculation() {
        // future implmentation
    }
}
