import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000;

        System.out.println("1.Deposit  2.Withdraw  3.Balance");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter amount: ");
            balance += sc.nextDouble();
        } 
        else if (choice == 2) {
            System.out.print("Enter amount: ");
            double amt = sc.nextDouble();
            if (amt <= balance)
                balance -= amt;
            else
                System.out.println("Insufficient balance");
        } 
        else if (choice == 3) {
            System.out.println("Balance: " + balance);
        }

        System.out.println("Final Balance: " + balance);
        sc.close();
    }
}
