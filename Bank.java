public class Bank {
    public static void main(String[] args) {
        double balance = 1000;
        int choice = 1; // simulate choice (1=deposit, 2=withdraw, 3=balance)

        if (choice == 1) {
            double amt = 500;
            balance += amt;
            System.out.println("Deposited: " + amt);
        } 
        else if (choice == 2) {
            double amt = 200;
            if (amt <= balance)
                balance -= amt;
        } 
        else {
            System.out.println("Balance: " + balance);
        }

        System.out.println("Final Balance: " + balance);
    }
}
