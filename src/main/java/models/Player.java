package models;

import java.util.Scanner;

/**
 * Class meant to represent the player. It should, at minimum, hold the score and attempts.
 *
 * @author Nathan (goodguyplayer)
 * @Version 0
 * @since 2021-04-15
 */

/*
Changelog.:

Version 0
    - Added variables
    - Added constructor
    - Added increaseScore
    - Added getScore
    - Added getAttempt
    - Added setAttempt
 */
public class Player {
    private int score;
    private String attempt;
    Scanner reader = new Scanner(System.in);

    /**
     * Constructor. Once class is created, start the score and attempt.
     * @author Nathan (goodguyplayer)
     */
    public Player() {
        score = 0;
        attempt = "";
    }

    /**
     * method that simply increases the score by 1, to avoid touching the variable directly.
     * @author Nathan (goodguyplayer)
     */
    public void increaseScore(){
        score +=1;
    }

    /**
     * getter that returns the score of the player
     * @return {int} score  The score of the player.
     * @author Nathan (goodguyplayer)
     */
    public int getScore(){
        return score;
    }

    /**
     * getter that returns the player's attempt
     * @return {String} attempt  The player's attempt
     * @author Nathan (goodguyplayer)
     */
    public String getAttempt() {
        return attempt;
    }

    /**
     * method that receives the attempt and stores it.
     * @Author Nathan (goodguyplayer)
     */
    public void setAttempt(){
        attempt = reader.nextLine();
    }
}
