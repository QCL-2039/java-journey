package OOP.Problem1;

public class Person {
    public String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getName() {
        System.out.println("Name : " + name);
    }

    public void getAge() {
        System.out.println(" Age: " + age);
    }

    public void showDetails() {
        System.out.println("Name of the Person: " + name + ", Age: " + age);
    }

    // @Override
    // public String toString() {

    // return "Name of the person: " + name + " ,Age: " + age;
    // }

    public static void main(String[] args) {

        Person p = new Person("Sohel Rana", 24);
        p.showDetails();
        // System.out.println(p);

        Person p1 = new Person("Mehera Meher", 18);
        p1.showDetails();

    }
}
