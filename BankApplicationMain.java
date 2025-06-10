import java.util.Scanner;
public class BankApplicationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accountHolder;
        double balance;
        System.out.print("Enter account holder name: ");
        accountHolder = sc.nextLine();
        System.out.print("Enter initial balance: ");
        balance = sc.nextDouble();

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                double amt = sc.nextDouble();
                balance += amt;
                System.out.println("Deposited successfully.");
            } else if (choice == 2) {
                System.out.print("Enter withdraw amount: ");
                double amt = sc.nextDouble();
                if (amt <= balance) {
                    balance -= amt;
                    System.out.println("Withdrawn successfully.");
                } else {
                    System.out.println("Insufficient balance.");
                }
            } else if (choice == 3) {
                System.out.println(accountHolder + "'s balance: " + balance);
            } else if (choice == 4) {
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}
