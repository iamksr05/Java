package Demo;
import java.util.Scanner;

class Calculator {
	int num1;
	int num2;

	void calc() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter 1st Number: ");
		num1 = scan.nextInt();

		System.out.print("Enter 2nd Number: ");
		num2 = scan.nextInt();

		if (num1 > 0 && num2 < 100) {
			System.out.print("The sum is: " + (num1 + num2));
			
		} else {
			System.out.println("Invalid number, Try Again!");
		}
		scan.close();

	}
}

class Launch 
{
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		c.calc();
	}
}