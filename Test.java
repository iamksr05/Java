import java.util.*;

class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name: ");
		
		String name = scan.nextLine();
		
		System.out.println("Hello, " + name + "!");
		// System.out.print("Hello, " + name + "!\n");
		// System.out.printf("Hello, %s!", name);
        scan.close();
	}
}