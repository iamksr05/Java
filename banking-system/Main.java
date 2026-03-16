import java.util.Scanner;

class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Welcome to PW Bank.Login as\n1. Admin\n2. Customer");

        int choice = input.nextInt();

        while (true) {
            
            if (choice == 1) {
                AdminLogin admin = new AdminLogin();
                admin.adminPass(input);

                break;
                
            } else if (choice == 2) {
                
                break;

            } else {
                System.out.println("Invalid Choice. Enter correct choice: ");
            }

        }
    }

}

class AdminLogin {

    void adminPass(Scanner input) {
        System.out.println("Enter your user ID: ");
        int adminId = input.nextInt();
        
        System.out.println("Enter your Password: ");
        int adminPass = input.nextInt();

        if (adminId != 987654321 && adminPass != 1234) {
            System.out.println("Incorrect credentials. Try again!");
        } else {
            AdminDashboard adminDash = new AdminDashboard();
            adminDash.adminOption(input);
        }
    }
}


class CustomerLogin {

    void adminPass(Scanner input) {
        System.out.println("Enter your user ID: ");
        int userId = input.nextInt();
        
        System.out.println("Enter your user ID: ");
        int userPass = input.nextInt();

        if (userId != 987654321 && userPass != 1234) {
            System.out.println("Incorrect credentials. Try again!");
        } else {

        }
    }
}