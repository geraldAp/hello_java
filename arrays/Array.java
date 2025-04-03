import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int[] numbers2 = { 1, 3, 5, 2, 4 };

        System.out.println("First Element" + numbers[0]);
        System.out.println("Third Element" + numbers[3]);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number " + numbers[i]);
        }

        String[] names = { "Alice", "Bob", "Charlie" };

        for (int i = 0; i < names.length; i++) {
            System.out.println("Hello " + names[i]);
        }
        // Array methods
        Arrays.sort(numbers2);
        System.out.println("Sorted Array " + Arrays.toString(numbers2));

        int index = Arrays.binarySearch(numbers, 4);
        System.out.println("Index of 4: " + index);

        int[] copiedArray = Arrays.copyOf(numbers2, numbers2.length);
        System.out.println("Copied array " + Arrays.toString(copiedArray));

        // multidimensional array
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("The multi dimensional Array " + matrix[0][2]);
    }
}
