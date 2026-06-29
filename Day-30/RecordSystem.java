import java.util.Scanner;

public class RecordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] roll = new int[n];
        String[] name = new String[n];

        // Input Student Records
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Details of Student " + (i + 1));

            System.out.print("Enter Roll No: ");
            roll[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();
        }

        // Display Student Records
        System.out.println("\n----- Student Records -----");

        for (int i = 0; i < n; i++) {
            System.out.println("Roll No : " + roll[i]);
            System.out.println("Name    : " + name[i]);
            System.out.println();
        }

        sc.close();
    }
}