import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] id = new int[n];
        String[] name = new String[n];
        double[] salary = new double[n];

        // Input Employee Details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Details of Employee " + (i + 1));

            System.out.print("Enter Employee ID: ");
            id[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();
        }

        // Display Employee Details
        System.out.println("\n----- Employee Details -----");

        for (int i = 0; i < n; i++) {
            System.out.println("ID     : " + id[i]);
            System.out.println("Name   : " + name[i]);
            System.out.println("Salary : " + salary[i]);
            System.out.println();
        }

        sc.close();
    }
}