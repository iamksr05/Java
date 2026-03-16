import java.util.Scanner;

public class AdminDashboard {
    void adminOption(Scanner input) {

        while (true) {
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. Modify account");
            System.out.println("1. Deposit Money");
            System.out.println("1. Withdraw Money");
            System.out.println("1. View All Accounts");
            System.out.println("1. Logout");
            
            int adminChoice = input.nextInt();
            System.out.println(adminChoice);


        }
    }
}
