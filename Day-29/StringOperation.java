import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("\n1. Length");
        System.out.println("2. Reverse");
        System.out.println("3. Uppercase");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Length = " + str.length());
                break;

            case 2:
                for (int i = str.length() - 1; i >= 0; i--)
                    System.out.print(str.charAt(i));
                break;

            case 3:
                System.out.println(str.toUpperCase());
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}