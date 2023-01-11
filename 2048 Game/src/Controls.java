/**
 * Author: Dechsit Naetsawan
 * Revised: April 12th, 2021
 *
 * Description: Controls Class
 */

package src;
import src.Board;
import java.util.Scanner;

/**
 * @brief Class for controls which modify the game board.
 * @details This class contains multiple functions which are essential
 *          move and add the numbers on the board.
 */
public class Controls {
    private static int[][] matrix = Board.matrix;
    public static int moves = 0;
    public static int score;

    /**
     * @brief Mutator function which moves all values on the boards all the way up
     *        and adds any similar numbers.
     */
    public static void up() {
        int val = 0;
        for (int ind = 0; ind < 5; ind++) {
            for (int i = 1; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i - 1][j] == 0) {
                        matrix[i - 1][j] = matrix[i][j];
                        matrix[i][j] = 0;
                    }
                    else if (matrix[i - 1][j] == matrix[i][j]) {
                        val = matrix[i - 1][j] * 2;
                        matrix[i][j] = 0;
                        matrix[i - 1][j] = val;
                        score += val;
                        val = 0;
                    }
                }
            }
        }
        Board.addRandom(Board.getMatrix(), 2);
        moves++;
    }

    /**
     * @brief Mutator function which moves all values on the boards all the way down
     *        and adds any similar numbers.
     */
    public static void down() {
        int val = 0;
        for (int ind = 0; ind < 5; ind++) {
            for (int i = 0; i < matrix.length - 1; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i + 1][j] == 0) {
                        matrix[i + 1][j] = matrix[i][j];
                        matrix[i][j] = 0;
                    }
                    else if (matrix[i + 1][j] == matrix[i][j]) {
                        val = matrix[i + 1][j] * 2;
                        matrix[i][j] = 0;
                        matrix[i + 1][j] = val;
                        val = 0;
                    }
                }
            }
        }
        Board.addRandom(Board.getMatrix(), 2);
        moves++;
    }

    /**
     * @brief Mutator function which moves all values on the boards all the way left
     *        and adds any similar numbers.
     */
    public static void left() {
        int val = 0;
        for (int ind = 0; ind < 5; ind++) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 1; j < matrix[i].length; j++) {
                    if (matrix[i][j - 1] == 0) {
                        matrix[i][j - 1] = matrix[i][j];
                        matrix[i][j] = 0;
                    }
                    else if (matrix[i][j - 1] == matrix[i][j]) {
                        val = matrix[i][j - 1] * 2;
                        matrix[i][j] = 0;
                        matrix[i][j - 1] = val;
                        val = 0;
                    }
                }
            }
        }
        Board.addRandom(Board.getMatrix(), 2);
        moves++;
    }

    /**
     * @brief Mutator function which moves all values on the boards all the way right
     *        and adds any similar numbers.
     */
    public static void right() {
        int val = 0;
        for (int ind = 0; ind < 5; ind++) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    if (matrix[i][j + 1] == 0) {
                        matrix[i][j + 1] = matrix[i][j];
                        matrix[i][j] = 0;
                    }
                    else if (matrix[i][j + 1] == matrix[i][j]) {
                        val = matrix[i][j + 1] * 2;
                        matrix[i][j] = 0;
                        matrix[i][j + 1] = val;
                        val = 0;
                    }
                }
            }
        }
        Board.addRandom(Board.getMatrix(), 2);
        moves++;
    }
}
