package GuesserGame;
/**
 * A simple Guesser game. where there is one guesser, three players and an umpire.
 * 
 * <p>{@code Umpire} takes number from {@code Guesser} and three {@code Player},
 * which ever player's number matches with the guesser's number,
 * that {@code Player} wins the game.
 * 
 * <p>For example, the guesser chooses a number, say 65. The umpire takes
 * this number and also collects numbers from the players.
 * Player 1 guesses 35, Player 2 guesses 65, and Player 3 guesses 26.
 * The umpire then compares the guesser's number with the numbers guessed by the players.
 * In this case, Player 2's number matches the guesser's number, so Player 2 wins the game.
 * 
 * @author Karan
 * @version 1.0
 * 
 * There are four classes in this GuesserGame program - {@code GuesserGame}, {@code Player}, {@code Guesser}
 * and {@code Umpire}
 * <b>{@code Umpire}</b>
*/

/**
 * <p>The program begins execution in the main method, where an instance class of the umpire is created.
 * The umpire acts as the central controller of the game and manages the interaction between the guesser
 * and the players. The umpire first collects the number chosen by the guesser, then gathers the guesses
 * provided by the players, and finally compares the guessed numbers with the original number selected by
 * the guesser to determine the result of the game.
 */

 /**
 * <b>{@code GuesserGame}</b> - Main class which calls the umpire object logic and its method.
 * It has the main method where {@code Umpire} object is created as {@code u}
 * Represents the entry point of the Guesser Game program and coordinates the flow of the game. The class initializes the game controller and starts the sequence of actions required to play the game.
 */
public class GuesserGame {

	/**
	 * In {@code main} method, the {@code Umpire} method is created as {@code u} and three methods is called from {@code Umpire} object.
	 * 
	 * {@snippet :
	 * Umpire u = new Umpire();
	 * 
	 * u.collectingNumFromGuesser();
	 * u.collectionNumFromPlayer();
	 * u.comparing();
	 * }
	 * 
	 * @param args 
	 */
	public static void main (String[] args) {
		Umpire u = new Umpire();

		u.collectingNumFromGuesser();
		u.collectionNumFromPlayer();
		u.comparing();

	}
}