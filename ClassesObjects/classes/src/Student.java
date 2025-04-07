public class Student {
// the student class
    private int age;
    private String name;

    // constructor the age is going to be injected from the outside
    public Student(int age) {
        this.age = age;
    };

    // we can have as many constructors as we want to take different vars
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

}
