import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Array Elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("\n1. Display");
        System.out.println("2. Sum");
        System.out.println("3. Maximum");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (int x : arr)
                    System.out.print(x + " ");
                break;

            case 2:
                int sum = 0;
                for (int x : arr)
                    sum += x;
                System.out.println("Sum = " + sum);
                break;

            case 3:
                int max = arr[0];
                for (int x : arr)
                    if (x > max)
                        max = x;
                System.out.println("Maximum = " + max);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}