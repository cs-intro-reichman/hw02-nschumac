/**
 * Prints a given string, backward. Then prints the middle character in the
 * string. The program expects to get one command-line argument: A string.
 */
public class Reverse {
    public static void main(String[] args) {

        String stringToReverse = args[0];
        String reversedString = "";

        // Build the reversed string
        for (int i = stringToReverse.length() - 1; i >= 0; --i) {
            reversedString += stringToReverse.charAt(i);
        }

        System.out.println(reversedString);
        System.out.println("The middle character is "
                + reversedString.charAt(reversedString.length() / 2));
    }
}
