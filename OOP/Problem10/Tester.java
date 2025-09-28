package OOP.Problem10;

public class Tester {
    public static void main(String[] args) {

        CSEDept cse = new CSEDept("Sohel Rana");
        EEEDept eee = new EEEDept("Mehera Meher");
        Course c = new Course("OOP", "CSE3333", 3);
        Course c1 = new Course("EEE", "EEE1258", 3);
        cse.addCourse(c1);
        cse.addCourse(c);
        cse.showStudentDetails();
        cse.showCourselist();
        eee.showCourselist();

    }

}
