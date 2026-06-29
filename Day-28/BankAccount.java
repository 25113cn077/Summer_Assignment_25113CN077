import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();
        balance += deposit;

        System.out.print("Enter Withdrawal Amount: ");
        double withdraw = sc.nextDouble();

        if (withdraw <= balance) {
            balance -= withdraw;
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Balance");
        }

        System.out.println("Current Balance = " + balance);
    }
}