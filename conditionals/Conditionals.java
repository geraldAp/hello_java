
public class Conditionals {

    public static void main(String[] args) {
        int number = 8;
        int cNumber = 10;
        if (number > cNumber) {
            System.out.println(number + " is greater than " + cNumber);
        } else if (number == cNumber) {
            System.out.println("Both numbers are equal");
        } else {
            System.out.println(number + " is less than " + cNumber);
        }

        int number2 = 7;

        if (number > number2 && number < cNumber) {
            System.out.println(number + " is between " + number2 + " and " + cNumber);
        }

        // Switch Statement
        int day = 2;
        int day2 = 3;
        String dayName = null;
     
        switch (day) {
            case 1:
                dayName = "Day 1";
                break;
            case 2:
                dayName = "Day 2";
                break;
            case 3:
                dayName = "Day 3";
                break; // Add this break
            default:
                dayName = "Unknown Day";
        }

        System.out.println("It is " + dayName);

        // Enhanced switch in java14 or later 
        String dayName2 = null;
        dayName2 = switch (day2) {
            case 1 -> "Day 1";
            case 2 -> "Day 2";
            case 3 -> "Day 3";
            default -> "Unknown Day";
        };
        System.out.println("2nd It is  " + dayName2);

    }
}
