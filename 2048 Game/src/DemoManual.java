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

public class DemoManual {
    public static void main(String[] args) throws Exception {
        int[][] matrix = new int[4][4];
        Board.addRandom(matrix, 2);
        Board.addRandom(matrix, 2);


        System.out.println("Begin!");
        Board.setMatrix(matrix);
        View.View();

        //Demo only plays till 8 otherwise it would take too long
        while (!Board.searchArray(matrix, 8)) {
                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter move (up, down, left or right (case sensitive))");

                String move = myObj.nextLine();
                if (move.equals("up")) {
                    System.out.println("Move up");
                    Controls.up();
                    View.View();
                }
                else if (move.equals("down")){
                    System.out.println("Move down");
                    Controls.down();
                    View.View();
                }
                else if (move.equals("left")){
                    System.out.println("Move left");
                    Controls.left();
                    View.View();
                }
                else if (move.equals("right")){
                    System.out.println("Move right");
                    Controls.right();
                    View.View();
                }
                else {
                    System.out.println("Please choose from up, down, left or right (case sensitive)");
                }

            if (!Board.searchArray(matrix, 0)) {
                    System.out.println("You Lost! Game Over!");
                    break;
                }
            }
        }
}
