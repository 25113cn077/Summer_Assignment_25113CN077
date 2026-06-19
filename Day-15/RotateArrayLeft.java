import java.util.Scanner;

public class RotateArrayLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of left rotations (m): ");
        int m = sc.nextInt();

        // Handle cases where m > n
        m = m % n;

        for (int j = 0; j < m; j++) {
            int first = arr[0];

            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[n - 1] = first;
        }

        System.out.println("Array after left rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}