/**
 * Author: Dechsit Naetsawan
 * Revised: April 12th, 2021
 *
 * Description: 2048 Test Class
 */

package src;
import java.util.Scanner;
import src.Board;
import src.View;
import src.Controls;

public class DemoAutomatic {
    public static void main(String[] args) throws Exception {
        int[][] matrix = new int[4][4];
        Board.addRandom(matrix, 2);
        Board.addRandom(matrix, 2);


        System.out.println("Begin!");
        Board.setMatrix(matrix);
        View.View();

        //Demo only plays till 128 otherwise it would take too long
        while (!Board.searchArray(matrix, 128)) {
                System.out.println("Move up");
                Controls.up();
                View.View();

                System.out.println("Move down");
                Controls.down();
                View.View();

                System.out.println("Move left");
                Controls.left();
                View.View();

                System.out.println("Move right");
                Controls.right();
                View.View();

            if (!Board.searchArray(matrix, 0)) {
                System.out.println("You Lost! Game Over!");
                break;
            }
        }
    }
}
