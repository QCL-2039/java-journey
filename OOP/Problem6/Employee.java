package OOP.Problem6;

public class Employee {
    public String name;
    public String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public double yearlySalary() {
        return salary * 12;
    }

    public void updateSalary(double percentage) {
        this.salary += salary * (percentage / 100);
        System.out.println(toString() + " updated salary is : " + salary);
    }

    @Override
    public String toString() {

        return "Employee Name: " + name + ", Title: " + jobTitle;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Sohel Rana", "Manager", 40000);
        System.out.println("Yearly Salary of " + e + " is :" + e.yearlySalary());
        e.updateSalary(10);

    }
}
