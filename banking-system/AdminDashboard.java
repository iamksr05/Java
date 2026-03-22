import java.util.Scanner;

public class AdminDashboard {
    void adminOption(Scanner input) {

        while (true) {
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. Modify account");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. View All Accounts");
            System.out.println("7. Logout");
            
            int adminChoice = input.nextInt();
            System.out.println(adminChoice);
            
            if (adminChoice == 1) {

            } else if (adminChoice == 2) {

            } else if (adminChoice == 3) {

            } else if (adminChoice == 4) {

            } else if (adminChoice == 5) {

            } else if (adminChoice == 6) {

            } else if (adminChoice == 7) {
                break;
            }
        }
    }
}
