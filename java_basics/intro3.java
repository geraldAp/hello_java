
public class intro3 {
    // Strings
    public static void main(String[] args) {
        String greeting = "Hello world";
        System.out.println(greeting);

        String firstname = "John";
        String lastname = "Walker";
        String fullname = firstname + " " + lastname;

        System.out.println(fullname);

        String text = "Hello trying to get the length of this text";
        int length = text.length();

        System.out.println("Length : " + length);

        String upperCaseText = text.toUpperCase();
        String lowerCaseText = text.toLowerCase();
        char charAtPosition = text.charAt(1);
        String substringText = text.substring(7, 12);

        System.out.println("Uppercase Text" + upperCaseText);
        System.out.println("Lowercase Text" + lowerCaseText);
        System.out.println("Char at position 1 " + charAtPosition);
        System.out.println("SubstringText  7 - 12 " + substringText);

        String text1 = "Hello";
        String text2 = "Hello";
        String text3 = "Hello";

        boolean isEqual = text1.equals(text2);
        int compareResult = text1.compareTo(text3);

        System.out.println("Is Equal : " + isEqual);
        System.out.println("Compare Result : " + compareResult);

    }

}
