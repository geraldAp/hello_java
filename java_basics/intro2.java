
public class intro2 {
    // operators
    public static void main(String[] arg) {
        // arithmetic
        int a, b;
        a = 10;
        b = 5;

        int sum = a + b;
        int dif = a - b;
        int prod = a * b;
        int quot = a / b;
        int mod = a % b;

        System.out.println("Sum : " + sum);
        System.out.println("Difference is : " + dif);
        System.out.println("the product is : " + prod);
        System.out.println("Quotient is : " + quot);
        System.out.println("Modulo is : " + mod);

        // relational operators
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreaterThan = (a > b);
        boolean isLessThan = (a < b);
        boolean isLessThanOrEqual = (a <= b);

        System.out.println("a == b: " + isEqual);
        System.out.println("a != b: " + isNotEqual);
        System.out.println("a > b: " + isGreaterThan);
        System.out.println("a < b: " + isLessThan);
        System.out.println("a <= b: " + isLessThanOrEqual);

        boolean x = true;
        boolean y = false;

        boolean andResult = x && y;
        boolean orResult = x || y;
        boolean notResult = !x;

        System.out.println("AND Result: " + andResult);
        System.out.println("OR Result: " + orResult);
        System.out.println("NOT Result: " + notResult);

        // assignment operators
        System.out.println("a : " + a);
        a += b;
        System.out.println("a +=b : " + a);
        a *= b;
        System.out.println("a *=b : " + a);
        a /= b;
        System.out.println("a /=b : " + a);
        a %= b;
        System.out.println("a %=b : " + a);

        // increment and decrement
        a++;
        System.out.println("a++" + a);
        a--;
        System.out.println("a--" + a);

        boolean c = true;
        System.out.println("!b:" + !c);
    }

}
