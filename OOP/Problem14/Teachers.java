package OOP.Problem14;

public class Teachers {
    String name;
    String teacherId;

    Teachers(String name, String teacherId) {
        this.name = name;
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher Name: " + name + " Teacher ID: " + teacherId;
    }

}
