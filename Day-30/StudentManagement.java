import java.util.Scanner;

public class StudentManagement {

    static Scanner sc = new Scanner(System.in);

    static int n;
    static int[] roll;
    static String[] name;

    // Add Students
    static void addStudents() {
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Details of Student " + (i + 1));

            System.out.print("Enter Roll No: ");
            roll[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();
        }
    }

    // Display Students
    static void displayStudents() {
        System.out.println("\n----- Student Records -----");

        for (int i = 0; i < n; i++) {
            System.out.println("Roll No : " + roll[i]);
            System.out.println("Name    : " + name[i]);
            System.out.println();
        }
    }

    // Search Student
    static void searchStudent() {
        System.out.print("Enter Roll Number to Search: ");
        int r = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (roll[i] == r) {
                System.out.println("\nStudent Found");
                System.out.println("Roll No : " + roll[i]);
                System.out.println("Name    : " + name[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found.");
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter Number of Students: ");
        n = sc.nextInt();
        sc.nextLine();

        roll = new int[n];
        name = new String[n];

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Students");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudents();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}