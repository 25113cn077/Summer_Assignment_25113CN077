import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 10000;

        while (true) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Balance = " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Deposit Successful.");
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Please collect your cash.");
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}