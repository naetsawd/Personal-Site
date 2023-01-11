/**
 * Author: Dechsit Naetsawan
 * Revised: April 11th, 2021
 *
 * Description: Board class
 */

package src;
import java.util.Random;

/**
 * @brief Class for the game board and tile controls.
 * @details This class contains multiple functions which are essential to construct
 * and modify a the game board.
 */
public class Board {
    static int[][] matrix = new int[4][4];
    private static Random random = new Random();

    /**
     * @brief Setter function which sets the game board.
     * @param matIn 2D array that represents the game board.
     */
    public static void setMatrix(int[][] matIn){
        matrix = matIn;
    }

    /**
     * @brief Getter function which gets the game board.
     * @return Game board as a 2D array.
     */
    public static int[][] getMatrix(){
        return matrix;
    }

    /**
     * @brief Function which searches the game board for a specific number.
     * @param matIn 2D array that represents the game board.
     * @param val Number that needs to be found as an integer.
     */
    public static Boolean searchArray(int[][] matIn, int val) {
        Boolean result = false;
        for (int i = 0; i < matIn.length; i++) {
            for (int j = 0; j < matIn[i].length; j++) {
                if (matIn[i][j] == val) {
                    result = true;
                }
            }
        }
        return result;
    }

    /**
     * @brief Function which adds a random number to the game board.
     * @param matIn 2D array that represents the game board.
     * @param val Number that needs to be added as an integer.
     */
    public static void addRandom(int[][] matIn, int val) {
        if (searchArray(matrix, 0)) {
            int tiles = 1;
            while (tiles > 0) {
                for (int i = 0; i < matIn.length; i++) {
                    for (int j = 0; j < matIn[i].length; j++) {
                        if (random.nextInt(100) == 1 && tiles > 0
                                && matIn[i][j] == 0) {
                            matIn[i][j] = val;
                            tiles--;
                        }
                    }
                }
            }
        }
    }
}
