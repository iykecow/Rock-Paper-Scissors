
import java.util.*;
/**
 * Example1 Player will first play rock, then all scissors
 */
public class ionlyPaper implements Player

{
    private static String name = "onlyPaper";
    private static String strategy = "Rock then all scissors";

    public String move(String [] myMoves, String [] opponentMoves, int myScore, int opponentScore)
    {
        return "p";
    }

    public String getName()
    {
        return name;
    }
}
