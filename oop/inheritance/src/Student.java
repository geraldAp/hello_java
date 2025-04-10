public class Student extends Person {
    // student extends Person, the student inherits properties form Person

    private String nameOfUniversity;

    public Student(int age, String name, String nameOfUniversity) {
        super(age, name); // represents the parent class
        this.nameOfUniversity = nameOfUniversity;
    }

    public void showStudent(){
        System.out.println("Student name " + name);
        System.out.println("Student age " + age);
        System.out.println("Student university " + nameOfUniversity);
    }

    public void showAge(){
        super.showAge();
    }

}
