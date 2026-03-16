package GuessGame;

/**
 * <b>{@code Umpire}</b> - The Umpire class controls the flow of the guessing game.
 * 
 * It is responsible for:
 * <ul>
 * <li>Collecting the number guessed by the Guesser</li>
 * <li>Collecting the numbers guessed by the players</li>
 * <li>Comparing the guessed numbers to determine the winner</li>
 * </ul>
 * 
 * The class interacts with the Guesser and Player classes to retrieve
 * the guessed numbers and then evaluates which player, if any,
 * correctly guessed the number.
 */
public class Umpire {

    /** Stores the number guessed by the Guesser */
    int numFromGuesser;

    /** Stores the number guessed by Player 1 */
    int numFromPlayer1;

    /** Stores the number guessed by Player 2 */
    int numFromPlayer2;

    /** Stores the number guessed by Player 3 */
    int numFromPlayer3;

    /**
     * Collects the number from the Guesser.
     * 
     * Creates an instance of the Guesser class and retrieves
     * the guessed number using the guesserNum() method.
     */
    void collectingNumFromGuesser() {
        Guesser guess = new Guesser();
        numFromGuesser = guess.guesserNum();
    }

    /**
     * Collects numbers guessed by all three players.
     * 
     * Creates Player objects and retrieves their guessed numbers
     * using the playerNum() method.
     */
    void collectionNumFromPlayer() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numFromPlayer1 = p1.playerNum();
        numFromPlayer2 = p2.playerNum();
        numFromPlayer3 = p3.playerNum();
    }

    /**
     * Compares the numbers guessed by the players with the
     * number guessed by the Guesser and declares the winner.
     * 
     * If none of the players guess correctly, the game is lost.
     */
    void comparing() {
        if (numFromPlayer1 == numFromGuesser) {
            System.out.println("Player 1 has won the game");
        }
        else if (numFromPlayer2 == numFromGuesser) {
            System.out.println("Player 2 has won the game");
        }
        else if (numFromPlayer3 == numFromGuesser) {
            System.out.println("Player 3 has won the game");
        }
        else {
            System.out.println("Game Lost! Try again.");
        }
    }
}