package OOP.Problem14;

import java.util.ArrayList;

public class School {

    ArrayList<Student> students;
    ArrayList<Teachers> teachers;
    ArrayList<Classes> classes;

    School() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        classes = new ArrayList<>();
    }

    void showAllStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    void showAllTeachers() {
        for (Teachers t : teachers) {
            System.out.println(t);
        }
    }

    void showAllClasses() {
        for (Classes c : classes) {
            System.out.println(c);
        }
    }

    Classes addClass(String name, int capacity) {
        return new Classes(name, capacity);
    }

    public static void main(String[] args) {
        School school = new School();
        Student s1 = new Student("Sohel Rana", "CSE573", 4);
        school.students.add(s1);
        Teachers t1 = new Teachers("Raihan Ul-Masood", "CSE42222");
        school.teachers.add(t1);
        Classes c = new Classes("PHY1303", 30);
        school.classes.add(c);
        Classes c2 = school.addClass("Lab-404", 50);
        school.classes.add(c2);
        school.showAllStudents();
        school.showAllTeachers();
        school.showAllClasses();

    }

}
