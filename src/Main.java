import java.util.Scanner;

public class Main {
    private final static int ACCOUNT_NUMBER = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int balance = 0;
        int accountNumber = 0;
        int amount = 0;

        menu();
        while (choice != 3) {
            System.out.print("Your choice: ");
            choice = sc.nextInt();

            // starting transaction
            switch (choice) {
                case 1 -> {
                    // deposit
                    System.out.println("Deposit");
                    System.out.print("Enter account number: ");
                    accountNumber = sc.nextInt();
                    if (accountNumber == ACCOUNT_NUMBER) {
                        System.out.print("Enter amount to deposit: ");
                        amount = sc.nextInt();

                        // updating balance
                        balance += amount;
                        System.out.println("New balance: " + balance);
                    } else {
                        System.out.println("Invalid account number!");
                    }
                }
                case 2 -> {
                    // withdraw
                    System.out.println("Withdraw");
                    System.out.print("Enter account number: ");
                    accountNumber = sc.nextInt();

                    if (accountNumber == ACCOUNT_NUMBER) {
                        System.out.print("Enter amount to withdraw: ");
                        amount = sc.nextInt();

                        // updating balance
                        balance -= amount;
                        System.out.println("New balance: " + balance);
                    } else {
                        System.out.println("Invalid account number!");
                    }
                }
            }
        }

    }

    static void menu() {
        System.out.println("1-deposit\n2-withdraw\n3-exit");
    }
}