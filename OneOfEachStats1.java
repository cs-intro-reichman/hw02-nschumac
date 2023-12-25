import java.util.Random;

/**
 * Computes some statistics about families in which the parents decide to have
 * children until they have at least one child of each gender. The program
 * expects to get one command-line argument: an int value that determines how
 * many families to simulate.
 */
public class OneOfEachStats1 {
    public static void main(String[] args) {
        // Gets the two command-line arguments
        int T = Integer.parseInt(args[0]);
        Random generator = new Random();

        int familiesWithTwoChildren = 0;
        int familiesWithThreeChildren = 0;
        int familiesWithFourOrMoreChildren = 0;
        String mostCommon = "";
        Double totalChildCount = 0.0;

        for (int i = 0; i < T; ++i) {
            Boolean boyCreated = false;
            Boolean girlCreated = false;
            int childrenCount = 0;

            while (!boyCreated || !girlCreated) {
                if (generator.nextDouble() <= 0.5) {
                    boyCreated = true;
                } else {
                    girlCreated = true;
                }
                childrenCount++;
            }

            totalChildCount += childrenCount;

            if (childrenCount >= 4) {
                familiesWithFourOrMoreChildren++;
            } else if (childrenCount == 3) {
                familiesWithThreeChildren++;
            } else {
                familiesWithTwoChildren++;
            }
        }

        System.out.printf(
                "Average: %f children to get at least one of each gender.\n",
                totalChildCount / T);
        System.out.printf("Number of families with 2 children: %d\n",
                familiesWithTwoChildren);
        System.out.printf("Number of families with 3 children: %d\n",
                familiesWithThreeChildren);
        System.out.printf(
                "Number of families with 4 or more children: %d\n",
                familiesWithFourOrMoreChildren);

        if (familiesWithFourOrMoreChildren > familiesWithThreeChildren) {
            mostCommon =
                    familiesWithFourOrMoreChildren > familiesWithTwoChildren
                            ? "4 or more"
                            : "2";
        } else {
            mostCommon =
                    familiesWithThreeChildren > familiesWithTwoChildren
                            ? "3"
                            : "2";
        }
        System.out.printf(
                "The most common number of children is %s.\n",
                mostCommon);
    }
}
