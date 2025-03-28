
public class intro1 {
    public static void main(String[] args) {
        // primitive data types
        int age; // stores integers or whole numbers
        age = 25;
        System.out.println("Age: " + age);

        byte smallNumber = 10;
        short mediumNumber = 1000;
        long largeNumber = 1000000L;

        System.out.println("Small " + smallNumber);
        System.out.println("medium Number " + mediumNumber);
        System.out.println("Large Number  " + largeNumber);

        // floating point numbers

        float height = 5.8f; //
        double distance = 345.67;
        System.out.println("Height  " + height);
        System.err.println("Distance  " + distance);

        // Char data types
        char initial = 'R';
        System.out.println(" Initial : " + initial);

        // boolean
        boolean isJavaFun = true;
        System.out.println("Is Java fun : " + isJavaFun);

        // converting a double into an int
        double numDouble = 10.99;
        int numInt = (int) numDouble;

        System.out.println("numDouble : " + numDouble);
        System.out.println("numInt : " + numInt);
    }
}