import java.util.*;
/**
 * Write a description of interface Player here.
 * 
 * 
 * 
 * @IsaacKao (your name) 
 * @v1.0 (a version number or a date)
 */

public interface Player
{
    public String move(String [] myMoves, String [] opponentMoves, int myScore, int opponentScore);
    public String getName();
}
