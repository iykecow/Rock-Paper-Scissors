import java.util.*;
/**
 * Example1 Player will first play rock, then all scissors
 */
public class ionlyScissors implements Player

{
    private static String name = "onlyScissors";

    public String move(String [] myMoves, String [] opponentMoves, int myScore, int opponentScore)
    {
        return "s";
    }

    public String getName()
    {
        return name;
    }
}
