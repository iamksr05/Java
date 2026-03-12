import java.util.Scanner;

class GuesserGame {
	public static void main (String[] args) {
		Umpire u = new Umpire();

		u.collectingNumFromGuesser();
		u.collectionNumFromPlayer();
		u.comparing();
	}
}


class Player {
	Scanner scanner = new Scanner(System.in);
	int num;
	
	int playerNum() {
		System.out.print("Enter your number for player: ");
		int num = scanner.nextInt();
		return num;
	}
}


class Guesser {
	Scanner scanner = new Scanner(System.in);
	int guesserNum;

	int guesserNum() {
		System.out.print("Enter your number for Guesser: ");
		int guesserNum = scanner.nextInt();
		return guesserNum;
	}
}


class Umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;

	void collectingNumFromGuesser() {
		Guesser guess = new Guesser();

		numFromGuesser = guess.guesserNum();
	}
	
	void collectionNumFromPlayer() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();

		numFromPlayer1 =  p1.playerNum();
		numFromPlayer2 =  p2.playerNum();
		numFromPlayer3 =  p3.playerNum();
	}

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
