import java.util.*;
/**
 * Driver class, sets up game
 * Look to comments to see what you need to do to test your game
 */
public class Main
{
    public static void main(String [] args)
    {
        Player [] players = new Player[5];  //need to update array based on number of players
        boolean printsRun = false;   //printsRun is a boolean set to display moves as game goes, used for debugging
        
        //add players to game
        players[0] = new ionlyPaper();
        players[4] = new iRandom();
        players[3] = new ionlyRock();
        players[2] = new ionlyScissors();
        players[1] = new iIsaacMain();

        //construct the game with the classes in the players array, calls on play and displays the score
        //DO NOT CHANGE
        Game newGame = new Game(players, printsRun);
        newGame.play();
        newGame.displayScore();
    }
}