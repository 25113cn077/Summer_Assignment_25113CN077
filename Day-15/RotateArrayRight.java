import java.util.Scanner;

public class RotateArrayRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of right rotations (m): ");
        int m = sc.nextInt();

        m = m % n;

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(i + m) % n] = arr[i];
        }

        System.out.println("Array after right rotation:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}