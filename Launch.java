import java.util.Scanner;

class Calculator {
	int num1;
	int num2;

	void calc(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("The sum is: " + sum);
	}
}

class Launch 
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator c = new Calculator();

		System.out.print("Enter 1st Number: ");
		c.num1 = scan.nextInt();
		System.out.print("Enter 2nd Number: ");
		c.num2 = scan.nextInt();

		if (c.num1 > 0 && c.num2 < 100) {
			System.out.print("The sum is: ");
			c.calc(c.num1, c.num2);
		} else {
			System.out.println("Invalid number, Try Again!");
		}

		scan.close();

	}
}