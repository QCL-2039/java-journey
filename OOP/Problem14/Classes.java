package OOP.Problem14;

public class Classes {
    String name;
    int capacity;

    Classes(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Class Name: " + name + " Classroom Capacity: " + capacity;
    }
}
