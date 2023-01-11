/**
 * Author: Dechsit Naetsawan
 * Revised: April 12th, 2021
 *
 * Description: View Class
 */

package src;
import src.Board;
import src.Controls;

/**
 * @brief Class which displays the game board.
 * @details This class contains print functions to display the game board and stats.
 */
public class View {
    private static int[][] matrix = Board.matrix;

    /**
     * @brief Function does al the printing using information from other modules.
     */
    public static void View() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == 0) {System.out.print("| ");}
                System.out.print((matrix[i][j]) + " ");
            }
            System.out.println("|");
        }
        System.out.println("Moves = " + Controls.moves + "  " + "Score = " + Controls.score);
    }
}
