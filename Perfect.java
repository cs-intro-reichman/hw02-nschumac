/**
 * Gets a command-line argument (int), and chekcs if the given number is
 * perfect.
 */
public class Perfect {
    public static void main(String[] args) {
        int numberToTest = Integer.parseInt(args[0]);
        String positiveResult =
                String.format("%d is a perfect number since %d = 1",
                        numberToTest, numberToTest);

        // add 1 since we already have it
        int sum = 1;

        for (int i = 2; i < numberToTest; ++i) {
            if (numberToTest % i > 0) {
                continue;
            }

            positiveResult += String.format(" + %d", i);
            sum += i;
        }

        if (sum == numberToTest) {
            System.out.println(positiveResult);
        } else {
            System.out.printf("%d is not a perfect number",
                    numberToTest);
        }
    }
}
