
public class Loop {
    public static void main(String[] args) {

        // while loop
        int count = 1;
        int count2 = 1;
        int count3 = 10;
        while (count <= 10) {
            System.out.println("Count : " + count);
            count++;
        }

        while (true) {
            System.out.println("Count with bool " + count2);
            count2++;
            if (count2 > 5) {
                break;
            }
        }

        // for loop

        for (int i = 1; i <= count3; i++) {
            System.out.println("i's value is " + i);
        }
    }
}
