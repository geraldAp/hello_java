
public class Methods {
// in the main method we call static methods 
    // methods
    // public method
   public  static void greet() {
        System.out.println("hello welcome to Java methods");
    }

    // method overload defining methods with the same name but different params 
    static int product(int a, int b) {
        return a * b;
    }

    static double product(double a, double b) {
        return a * b;
    }



    public static void main(String[] args) {
        greet();
        int value = product(12, 8);
        System.out.println("The value of the multiplication is : " + value);
        double value2 = product(1.6, 3.8);
        System.out.println("The value of the multiplication is : " + value2);
    }
}
