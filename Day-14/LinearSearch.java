import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Searching Element: ");
        int m = sc.nextInt();

        boolean found = false;

        System.out.print("Element found at indexes: ");

        for (int i = 0; i < n; i++) {
            if (arr[i] == m) {
                System.out.print(i+1 + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}