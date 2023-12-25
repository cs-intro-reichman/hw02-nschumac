import java.util.Random;

/**
 * Generates and prints random integers in the range [0,10), as long as they
 * form a non-decreasing sequence.
 */
public class InOrder {
    public static void main(String[] args) {

        Random randomObject = new Random();

        int generatedNumber = randomObject.nextInt(10);
        int previousNumber;
        do {
            System.out.print(generatedNumber + " ");
            previousNumber = generatedNumber;
            generatedNumber = randomObject.nextInt(10);
        } while (generatedNumber >= previousNumber);
    }
}
