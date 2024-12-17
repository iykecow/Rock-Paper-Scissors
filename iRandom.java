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
public class iRandom implements Player
{
    private static String name = "Random";
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
    public String move(String [] myMoves, String [] opponentMoves, int myScore, int opponentScore)
    {
        int rand = (int)(Math.random()*3);
        if (rand==0) {
            return "r"; 
        }
        else if (rand==1) {
            return "p";
        }
        else  {
            return "s";
        }
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
