
/**
 * Simulates the formation of a family in which the parents decide to have
 * children until they have at least one child of each gender.
 */
public class OneOfEach {
    public static void main(String[] args) {
        Boolean boyCreated = false;
        Boolean girlCreated = false;

        while (!boyCreated || !girlCreated) {
            if (Math.random() <= 0.5) {
                boyCreated = true;
                System.out.print("b ");
            } else {
                girlCreated = true;
                System.out.print("g ");
            }
        }
    }
}
