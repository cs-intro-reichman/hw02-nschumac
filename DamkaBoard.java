/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {

        int boardSize = Integer.parseInt(args[0]);

        for (int i = 0; i < boardSize; ++i) {
            if (i % 2 == 0) {
                // repeat is pretty sick I love it
                System.out.println("* ".repeat(boardSize));
            } else {
                System.out.println(" *".repeat(boardSize));
            }
        }
	}
}
