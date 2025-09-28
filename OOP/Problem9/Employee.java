package OOP.Problem9;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private LocalDate hireDate;

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public String getServicePeriod() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(hireDate, today);
        return period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days";
    }

    public void showDetails() {
        System.out
                .println("Employee: " + name + ", Hire Date: " + hireDate + ", Service Period: " + getServicePeriod());
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", LocalDate.of(2015, 3, 10));
        Employee e2 = new Employee("Bob", LocalDate.of(2020, 7, 1));

        e1.showDetails();
        e2.showDetails();
    }
}
