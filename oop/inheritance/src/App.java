public class App {

    /*
     * Inheritance -> when a class acquires the properties of another class methods
     * and variables
     * 
     * Class that inherits: subclass / derived class / child class
     * Class whose properties are inherited : superclass / parent class
     * 
     * super keyword -> with this keyword we can call the parent class
     * For example : same method in both classes we can differentiate the members
     * with super
     * Inheritance is a relationship
     */

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Student2 s = new Student2(20, "Nana Kwame", "MIT");

        s.showStudent();
        s.showAge();
    }
}
