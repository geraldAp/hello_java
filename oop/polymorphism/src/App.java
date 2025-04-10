public class App {
// polymorphism many forms many forms of an implementation like have a 2 method add one takes int vals one takes float vals 

    static class Animal {
        public void animalSound() {
            System.out.println("The animal makes a sound");
        }
    }

    static class Pig extends Animal {
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }

    static class Dog extends Animal {
        public void animalSound() {
            System.out.println("The dog says: bow wow");
        }
    }

    public static void main(String[] args) throws Exception {
        Animal myAnimal = new Animal(); // Create a Animal object
        Animal myPig = new Pig(); // Create a Pig object
        Animal myDog = new Dog(); // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        System.out.println("Hello, World!");

    }
}
