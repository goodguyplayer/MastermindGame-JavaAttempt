package models;

/**
 * class meant to represent a game session of the game Mastermind.
 * It should ask the player for an input of 4 letters, compare with the code and loop it until both are correct.
 *
 * @author Nathan (goodguyplayer)
 * @Version 0
 * @since 2021-04-15
 */

/*
Changelog.:

Version 0.:
    - Class created
    - Added vars
    - Added gameSession method
    - Added checkLetterMatch method
    - Added checkInCode method
 */
public class Session {
    Player player = new Player();
    Code code = new Code();
    int correct = 0;
    int incode = 0;


    /**
     * Represents a game session of mastermind.
     * Ask player input, check to see if it matches. If it does, exit and sout the score.
     * Else, add to score and repeat same steps.
     * @author Nathan (goodguyplayer)
     */
    public void gameSession(){
        boolean status = true;
        while (status){
            System.out.println("Please input 4 letters. (Excess letters will be ignored)");
            player.setAttempt();

            for (int i = 0; i < 4; i++) {
                if(checkLetterMatch(i)){
                    correct ++;
                }


            }
        }

    }

    /**
     * method that checks whether the letter at the given position matches the letter in the code.
     * @param position int that defines the position.
     * @return true if the letter match, false if it doesn't.
     * @author Nathan (goodguyplayer)
     */
    private boolean checkLetterMatch(int position){
        if (player.getAttempt().charAt(position) == code.getCode().charAt(position)){
            return true;
        }
        return false;
    }

    /**
     * method that checks whether the letter at the given position is in the code.
     * @param position
     * @return
     * @author Nathan (goodguyplayer)
     */
    private boolean checkInCode(int position){
        if (code.getCode().indexOf(player.getAttempt().charAt(position)) != -1){
            return true;
        }
        return false;
    }
}
