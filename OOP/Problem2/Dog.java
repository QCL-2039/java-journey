package OOP.Problem2;

public class Dog {
    private String breed;
    private String name;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void showDetails() {
        System.out.println("Dog Name: " + name + ", Dog's Breed: " + breed);
    }

    public static void main(String[] args) {

        Dog d = new Dog("Tom", "Persian");
        d.showDetails();
        d.setName("Jerry");
        d.setBreed("Bull Dog");
        // d.showDetails();
        System.out.println("Updated Dog Name: " + d.getName() + ", Updated Dog's Breed: " + d.getBreed());

    }
}
