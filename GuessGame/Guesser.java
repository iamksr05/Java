package GuessGame;
import java.util.Scanner;

/**
 * <b>{@code Guesser}</b> - It takes input from guesser using {@code Scanner} class.
 * 
 * There is a {@code guesserNum()} method in this class, it takes input from guesser using {@code nextInt} method
 * 
 * @return {@link guesserNum()} - Number given by guesser.
 */
public class Guesser {
	Scanner scanner = new Scanner(System.in);
	int guesserNum;

	int guesserNum() {
		System.out.print("Enter your number for Guesser: ");
		int guesserNum = scanner.nextInt();
		return guesserNum;
	}
}
