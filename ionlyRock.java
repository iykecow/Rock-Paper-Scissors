import java.util.*;
/**
 * Example1 Player will first play rock, then all scissors
 */
public class ionlyRock implements Player

{
    private static String name = "onlyRock";

    public String move(String [] myMoves, String [] opponentMoves, int myScore, int opponentScore)
    {
        return "r";
    }

    public String getName()
    {
        return name;
    }
}
