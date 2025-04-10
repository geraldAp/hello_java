public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // because the student is the child class of person thus this way of
        // instantiating
        Person2 student = new Student2();
        student.sayHello();
    }
}
