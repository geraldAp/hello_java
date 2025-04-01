import java.util.Scanner;

public class inputs {    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer - ");
        int number = scanner.nextInt();
        System.out.println("Integer Entered : " + number);

        System.out.println("Enter a double - ");
        double decimal = scanner.nextDouble();

        System.out.println("Double entered : " + decimal);

        scanner.nextLine(); // very important that you do this after double

        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

        int age = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter your age: ");
                age = scanner.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an invalid input");
                scanner.nextLine();
            }
        }
        System.out.println("Age entered : " + age
        );
    }

}
