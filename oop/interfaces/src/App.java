public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Dog dog = new Dog("bull dog", "male");
        Dog dog2 = new Dog("german shepherd", "female");

        dog.move();
        dog2.eat();
    }
}
