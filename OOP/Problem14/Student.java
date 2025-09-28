package OOP.Problem14;

public class Student {
    String name;
    String studId;
    int Class;

    Student(String name, String studId, int Class) {
        this.name = name;
        this.studId = studId;
        this.Class = Class;
    }

    @Override
    public String toString() {
        return "Student Name: " + name + ",Student ID: " + studId + " Class: " + Class;
    }

}
