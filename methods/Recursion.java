
public class Recursion {

    // Recursion is the technique of making a function call itself. This technique
    // provides a way to break complicated problems down into simple problems which
    // are easier to solve.

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        // Recursion
        int factorialResult = factorial(4);
        System.out.println("The factorial result is : " + factorialResult);
        int sumResult = sum(4);
        System.out.println("The summation is : " + sumResult);
    }
}
