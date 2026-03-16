package GuessGame;
import java.util.Scanner;

/**
 * <b>{@code Player}</b> - Player class has logic of taking input from players using {@code Scanner} class.
 * <p>The {@code playerNum()} method in this class, it takes input from player using {@code nextInt} method
 * 
 * @return num - Number guessed by a player.
 * 
*/
public class Player {
	Scanner scanner = new Scanner(System.in);
	int num;

	int playerNum() {
		System.out.print("Enter your number for player: ");
		int num = scanner.nextInt();
		return num;
	}
}

