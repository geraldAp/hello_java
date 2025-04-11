
// the great thing about interfaces is we can implement multiple interfaces
public class Dog implements Animal {
    String name;
    String gender;

    public Dog(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void move() {
        System.out.println("The " + gender + " " + name + " is moving");
    }

    public void eat() {
        System.out.println("The " + name + " is eating");
    }
}
