import java.util.*;
/**
 * Each player or team will create their own Player, this is only an example....
 * 
 * Your code MUST INCLUDE a move method with the following signature. To insure that, you must implement
 * the Player interface
 * 
 * You can create additional methods but must have the move method
 * 
 */
public class iIsaacMain implements Player
{
    private static String name = "Isaac Kao";
    /**
     * An example of a method - replace this comment with your own
     * You must create some kind of logic of what to play against your opponent...start thinking!
     * 
     * @return      the move you want to play against opponent
     *              "r" - rock
     *              "p" - paper
     *              "s" - scissors
     *              anything else - forfeit the turn
     */

    private static int counter = 0;
    private static int chooser = 0;

    public String move(String [] myMoves, String [] opponentMoves, int myScore, int opponentScore)
    {

        if (opponentScore>=myScore) {
            chooser++;
            if (chooser%3==0) {
                return "r";
            }
            else if (chooser%3==1) {
                return "p";
            }
            else if (chooser%3==2) {
                return "s";
            }
        }
        else {
            if (chooser%3==0) {
                return "r";
            }
            else if (chooser%3==1) {
                return "p";
            }
            else if (chooser%3==2) {
                return "s";
            }
        }
        return "p";

    }
    /**
     * Returns the name of the player
     * 
     * @return      the name of the player              
     */
    public String getName()
    {
        return name;
    }
}

